package controller;

import java.util.ArrayList;

import model.Model;
import view.View;
import model.Factura;

public class Controller {
    
    Model model;
    View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public ArrayList<Factura> valorMinimo(Double importe, Double descuento, Double iva){
        return model.valorMinimo(importe, descuento, iva);
    }

    public void init(){
        view.menu();
    }

    public boolean comprobarRuta(){
        return model.comprobarRuta();
    }

    public ArrayList<String> cogerListado(){
        return model.cogerListado();
    }

    public int exportarCsv(){
        return model.exportarCsv();
    }
}
