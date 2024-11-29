package model;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Model {
    
    Path pathDa = Paths.get(System.getProperty("user.home"), "Escritorio", "datosPersonales.csv");
    Path pathDi = Paths.get(System.getProperty("user.home"), "Escritorio", "direcciones.csv");

    ArrayList<Alumno> alumnos;

    public Model(){
        this.alumnos = new ArrayList<>();
    }

    public boolean exportarDatosCSV() {
        if(!pathDa.toFile().exists()){
            return false;
        } else {
            exportar(",", pathDa);
        }

        return true;
    }

    public boolean exportarDireccionesCSV() {
        if(!pathDi.toFile().exists()){
            return false;
        } else {
            exportar(",", pathDi);
        }

        return true;
    }

    private void exportar(String separador, Path path) {

        ArrayList<String> lineas = new ArrayList<>();

        for(Alumno alumno : alumnos){
            lineas.add(alumno.toString(separador));
        }

        try {
            Files.write(path, lineas, StandardCharsets.UTF_8);
        } catch (Exception e) {
            //excepcion
        }
    }

    public void crearListaAlumnos() {
        alumnos.clear();

        for(int i = 0; i<20; i++){
            Alumno alumno = new Alumno(alumnos);
            alumnos.add(alumno);
        }
    }

    public ArrayList<Alumno> getAlumnos(){
        return alumnos;
    }
}
