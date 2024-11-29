package controller;

import view.View;

import java.util.ArrayList;

import model.Alumno;
import model.Model;

public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void init() {
        view.menu();
    }
    
    public boolean exportarDatosCSV() {
        return model.exportarDatosCSV();
    }

    public boolean exportarDireccionesCSV() {
        return model.exportarDireccionesCSV();
    }

    public void crearListaAlumnos() {
        model.crearListaAlumnos();
    }

    public ArrayList<Alumno> getAlumnos(){
        return model.getAlumnos();
    }

}
