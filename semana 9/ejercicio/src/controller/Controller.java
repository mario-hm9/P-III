package controller;

import java.util.ArrayList;

import model.Libro;
import model.Model;
import view.View;

public class Controller {
    
    Model model;
    View view;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void init() {
        view.error(model.comprobarBin());
        view.menu();
    }

    public void agregarLibro(String titulo, String autor, int anio) {
        model.agregarLibro(titulo, autor, anio);
    }

    public int eliminarLibro(String titulo) {
        return model.eliminarLibro(titulo);
    }

    public int modificarLibro(Libro libro, String autor, int anio) {
        return model.modificarLibro(libro, autor, anio);
    }

    public Libro estaLibro(String titulo){
        return model.estaLibro(titulo);
    }

    public ArrayList<Libro> getLibros(){
        return model.getLibros();
    }

    public int exportarLibrosCSV(){
        return model.exportarLibrosCSV();
    }

    public int importarCSV(){
        return model.importarCSV();
    }
    
    public int exportarJSON(){
        return model.exportarJSON();
    }

    public int importarJSON(){
        return model.importarJSON();
    }

    public int exportarXML(){
        return model.exportarXML();
    }

    public int importarXML(){
        return model.importarXML();
    }
}
