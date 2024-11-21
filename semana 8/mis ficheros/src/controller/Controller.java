package controller;

import java.nio.file.Path;
import java.util.ArrayList;
import model.Partido;
import model.Quiniela;
import view.View;

public class Controller {

    Quiniela model;
    View view;
    Path ruta;

    public Controller(Quiniela model, View view){
        this.model = model;
        this.view = view;
    }

    public void init(){
        if(null == (this.ruta = model.cargarRuta())){
            view.errorInit();
        }
        model.cargarPartidos(ruta);
        view.menu();
    }

    public void errorCargarPartidos(){
        view.errorCargarPartidos();
    }

    public ArrayList<Partido> getPartidos(){
        return model.getPartidos();
    }
    
}
