package controller;

import java.util.HashMap;

import model.Model;
import view.View;

public class Controller {

    Model model;
    View view;

    double ingresos;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void leerVentas(){
        model.leerVentas();
    }

    public void leerPrecios(){
        model.leerPrecios();
    }

    public double calcularIngresos(){
        this.ingresos = model.calcularIngresos();
        return ingresos;
    }

    public void init(){
        view.menu();
    }

    public HashMap<Integer, Double> mis_Alpargatas(){
        return model.getAlpargatas();
    }

    public HashMap<Integer, Double> mis_Frigopies(){
        return model.getFrigopies();
    }

}
