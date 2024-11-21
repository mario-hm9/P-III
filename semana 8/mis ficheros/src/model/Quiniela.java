package model;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import controller.Controller;

public class Quiniela {

    private ArrayList<Partido> partidos;
    Controller controller;

    public Quiniela(){
        this.partidos = new ArrayList<>();
    }

    public Path cargarRuta(){
        
        Path ruta =  Paths.get( System.getProperty("user.home"), "Escritorio", "datos.txt");
        File rutaRef = ruta.toFile();

            if(rutaRef.exists() && rutaRef.isFile()){
                return ruta;
            } else {
                return null;
            }
    }

    public void cargarPartidos(Path ruta){

        List<String> lineas;

        try{
            lineas = Files.readAllLines(ruta, StandardCharsets.UTF_8);
            Partido p;

            for(String linea : lineas){
                String [] equipo = linea.split("-");
                p = new Partido(equipo[0], equipo[1]);
                calcularResultado(p);
                partidos.add(p);
            }


        } catch(Exception e){
            controller.errorCargarPartidos();
        }

    }

    private static void calcularResultado(Partido p){
        int v1 = (int) (Math.random() * 5) +1;
        int v2 = (int) (Math.random() * 5) +1;
        p.setGolesLocal(v1);
        p.setGolesVisitante(v2);

        if(v1 > v2){
            p.setResultado("1");
        } else if(v1 < v2){
            p.setResultado("2");
        } else {
            p.setResultado("X");
        }
    }

    public ArrayList<Partido> getPartidos(){
        return partidos;
    }
}
