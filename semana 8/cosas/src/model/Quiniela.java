package model;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Quiniela {

    private ArrayList<Partido> partidos;

    public Quiniela(){
        this.partidos = new ArrayList<>();
    }   
    
    public int cargarPartidoArchivo(Path rutaFichero){

        List<String> lineas = null; //va recibir todas las lineas de este fichero

        try{
            lineas = Files.readAllLines(rutaFichero,StandardCharsets.UTF_8);

            //cada linea del archivo representa un Partido
            //con una estructura de EquipoLocal-EquipoVisitante que sería equipo[0] y equipo[1]

            for( String linea : lineas){
                String[] equipos = linea.split("-");
                Partido p = new Partido(equipos[0], equipos[1]);
                partidos.add(p);
            }

            return partidos.size();

        } catch (IOException ex){
            //TODO: handle exception
            return -1;
        }

    }

    public ArrayList<Partido> getPartidos(){
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos){
        this.partidos = partidos;
    }

}
