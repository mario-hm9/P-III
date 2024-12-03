package model;

import java.io.File;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import controller.Controller;

public class Model {
    
    Controller controller;
    Path path = Paths.get(System.getProperty("user.home"), "Escritorio", "sesion 9", "libros.bin");
    Path pathCSV = Paths.get(System.getProperty("user.home"), "Escritorio", "sesion 9", "libros.csv");
    Path pathJSON = Paths.get(System.getProperty("user.home"), "Escritorio", "sesion 9", "libros.json");
    Path pathXML = Paths.get(System.getProperty("user.home"), "Escritorio", "sesion 9", "libros.xml");
    File file;
    File fileCSV;
    File fileJSON;
    File fileXML;

    ArrayList<Libro> libros = new ArrayList<>();
    ArrayList<Libro> librosCSV = new ArrayList<>();
    ArrayList<Libro> librosJSON;
    ArrayList<Libro> librosXML = new ArrayList<>();

    public int comprobarBin(){
        file = path.toFile();
        
        if(!file.exists()){
            return 1;
        } else if(!file.isFile()){
            return 2;
        }

        if(!ExportarImportar.exportar(file))
            return 3;
        if(!ExportarImportar.importar(file, libros))
            return 4;

        return 0;
    }

    public void agregarLibro(String titulo, String autor, int anio) {
        Libro libro = new Libro(titulo, autor, anio);
        libros.add(libro);
    }

    public int eliminarLibro(String titulo) {
        Libro libroBorrar;
        if((libroBorrar = estaLibro(titulo)) == null){
            return 5;
        } else {
            libros.remove(libroBorrar);
            return 0;
        }
        
    }

    public int modificarLibro(Libro libro, String autor, int anio) {
        libro.setAutor(autor);
        libro.setAnio(anio);
        return 0;
    }

    public Libro estaLibro(String titulo){
        for(Libro libro : libros){
            if(libro.getTitulo().equals(titulo)){
                return libro;
            }
        }
        return null;
    }

    public ArrayList<Libro> getLibros(){
        return libros;
    }

    public int exportarLibrosCSV(){
        fileCSV = pathCSV.toFile();
        if(!fileCSV.exists()){
            return 7;
        } else if(!fileCSV.isFile()){
            return 8;
        }

        ArrayList<String> librosCSV = new ArrayList<>();

        for(Libro libro : libros){
            librosCSV.add(libro.toStringDelimited(","));
        }

        try{
            Files.write(pathCSV, librosCSV,StandardCharsets.UTF_8);
        } catch (Exception e){
            return 9;
        }
        return -1;
    }

    public int importarCSV(){
        try{
            fileCSV = pathCSV.toFile();

            if(!fileCSV.exists()){
                return 7;
            } else if(!fileCSV.isFile()){
                return 8;
            }
            Scanner scanner = new Scanner(fileCSV);
            while(scanner.hasNextLine()){
                String linea = scanner.nextLine();
                String [] tmp = linea.split(",");
                Libro libro = new Libro(tmp[0], tmp[1], Integer.parseInt(tmp[2]));
                librosCSV.add(libro);
            }
            scanner.close();

        } catch (Exception e){
            return 14;
        }
        return -4;
    }

    public int exportarJSON(){

        fileJSON = pathJSON.toFile();

        if(!fileJSON.exists()){
            return 10;
        } else if(!fileJSON.isFile()){
            return 11;
        }

        Gson gson = new Gson();

        String json = gson.toJson(libros);

        try{
            Files.write(pathJSON, json.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e){
            return 12;
        }
        return -2;
    }

    public int importarJSON(){
        Gson gson = new Gson();
        
        try{
            fileJSON = pathJSON.toFile();

            if(!fileJSON.exists()){
                return 10;
            } else if(!fileJSON.isFile()){
                return 11;
            }
            String json = new String(Files.readAllBytes(pathJSON), StandardCharsets.UTF_8);
            Type tipoDeLista = new TypeToken<ArrayList<Libro>>() {}.getType();
            librosJSON = gson.fromJson(json, tipoDeLista);

            return -3;
        } catch (Exception e){
            return 13;
        }
    }

    public int exportarXML(){
        
        try{
            fileXML = pathXML.toFile();
            if(!fileXML.exists()){
                return 17;
            } else if(!fileXML.isFile()){
                return 18;
            }
            XmlMapper xmlMapper = new XmlMapper();
            String xml = xmlMapper.writeValueAsString(libros);
            Files.write(fileXML.toPath(), xml.getBytes(StandardCharsets.UTF_8));

            return -5;
        } catch (Exception e){    
            return 15;
        }
    }

    public int importarXML(){
        try{
            fileXML = pathXML.toFile();
            if(!fileXML.exists()){
                return 17;
            } else if(!fileXML.isFile()){
                return 18;
            }

            XmlMapper xmlMapper = new XmlMapper();
            String xml = new String(Files.readAllBytes(fileXML.toPath()), StandardCharsets.UTF_8);
            librosXML = xmlMapper.readValue(xml, xmlMapper.getTypeFactory().constructCollectionType(List.class, Libro.class));

            return -6;
        } catch (Exception e){
            return 16;
        }
    }

    
}
