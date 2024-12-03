package model;

import java.io.Serializable;

public class Libro implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String titulo;
    private String autor;
    private int anio;

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public String toStringDelimited(String l){
        return titulo + l + autor + l + anio;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año: " + anio;
    }

}
