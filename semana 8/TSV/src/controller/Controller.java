package controller;

import view.View;
import model.Model;
import model.Factura;

import java.nio.file.Path;
import java.util.ArrayList;

public class Controller {
    
    Model model;
    View view;

    Path path;
    String delimitador = "\t";

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void init() {
        Path ruta;
        if(null == (ruta = model.setPath())){
            view.errorPath();
        } else{
            this.path = ruta;
        }

        view.menu();
    }

    public void sacarDatos(double minimo) {
        model.sacarDatos(minimo, delimitador);
    }

    public void errorLineas() {
        view.errorLineas();
    }

    public void verDatos(ArrayList<Factura> facturas){
        view.verFactorasMinimo(facturas);
    }

}
