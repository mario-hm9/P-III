package controller;

import view.View;
import java.nio.file.Path;

import com.coti.tools.Rutas;

import model.Quiniela;

public class Controller {

    View view;
    Quiniela model;
    Path rutaFichero = Rutas.pathToFileInFolderOnDesktop("datos","equipos.txt");


    public Controller(View view, Quiniela model){
        this.view = view;
        this.model = model;
    }

    public void cargarPartidoArchivo(){
        int resultado = model.cargarPartidoArchivo(rutaFichero);
        //Decir a la vista que se ha cargado los partidos
        view.mostrarResultado(resultado);
    }
    


    public void init(){
        this.view.mostrarMenuPrincipal();
    }
}
