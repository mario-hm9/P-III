import java.io.Serializable;

public class Libro implements Serializable {
    private static final long serialVersionUID = 1L; // Necesario para la serialización
    private String titulo;
    private String autor;
    private int anio;

    // Constructor
    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    // Método toString para representar el libro como texto
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año: " + anio;
    }
}