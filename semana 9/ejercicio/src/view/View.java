package view;

import controller.Controller;
import model.Libro;

import java.util.ArrayList;

import com.coti.tools.Esdia;

public class View {
    
    Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public int menu() {
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Mostrar el listado de libros en formato tabla.");
            System.out.println("2. Añadir nuevo libro al modelo.");
            System.out.println("3. Eliminar libro de una lista de libros disponibles.");
            System.out.println("4. Modificar libro de una lista de libros disponibles.");
            System.out.println("5. Exportar libros en formato delimitado por comas CSV.");
            System.out.println("6. Exportar libros en formato JSON (libros.json en el escritorio).");
            System.out.println("7. Exportar libros en formato XML (libros.xml en el escritorio).");
            System.out.println("8. Importar libros de un fichero JSON (libros.json en el escritorio).");
            System.out.println("9. Importar libros de un fichero XML (libros.xml en el escritorio).");
            System.out.println("10. Importar libros de un fichero en formato delimitado por comas CSV (libros.csv en el escritorio).");
            System.out.println("11. Salir del programa.");

            opcion = Esdia.readInt("\nSeleccione una opción: ");

            switch (opcion) {
                case 1: mostrarTablaLibros(); break;
                case 2: agregarNuevoLibro(); break;
                case 3: eliminarLibro(); break;
                case 4: modificarLibro(); break;
                case 5: exportarLibrosCSV(); break;
                case 6: exportarJSON(); break;
                case 7: exportarXML(); break;
                case 8: importarJSON(); break;
                case 9: importarXML(); break;
                case 10: importarCSV(); break;
                case 11: salir(); break;
                default: System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 11);

        return 0;

    }

    private void importarXML(){
        int e = controller.importarXML();
        error(e);
        exito(e);
    }

    private void exportarXML(){
        int e = controller.exportarXML();
        error(e);
        exito(e);
    }

    private void importarJSON(){
        int e = controller.importarJSON();
        error(e);
        exito(e);
    }

    private void exportarJSON(){
        int e = controller.exportarJSON();
        error(e);
        exito(e);
    }

    private void importarCSV(){
        int e = controller.importarCSV();
        error(e);
        exito(e);
    }

    private void exportarLibrosCSV(){
        int e = controller.exportarLibrosCSV();
        error(e);
        exito(e);
        
    }

    private void agregarNuevoLibro(){

        String titulo = Esdia.readString("Introduce el título del libro: ");
        String autor = Esdia.readString("Introduce el autor del libro: ");
        int anio = Esdia.readInt("Introduce el año del libro: ");

        controller.agregarLibro(titulo, autor, anio);
    }

    private void eliminarLibro(){

        String titulo = Esdia.readString("Introduce el título del libro a eliminar: ");
        error(controller.eliminarLibro(titulo));
    }

    private void modificarLibro(){
        String titulo = Esdia.readString("Introduce el título del libro a modificar: ");

        Libro libro = controller.estaLibro(titulo);

        if(libro == null){
            error(6);
            return;
        }
        
        String nuevoAutor = Esdia.readString("Introduce el nuevo autor del libro: ");
        int nuevoAnio = Esdia.readInt("Introduce el nuevo año del libro: ");
        controller.modificarLibro(libro, nuevoAutor, nuevoAnio);
    }

    private void mostrarTablaLibros(){
        ArrayList<Libro> libros = controller.getLibros();
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la lista.");
            return;
        }

        System.out.printf("\n%-40s %-30s %-4s%n", "Título", "Autor", "Año");
        System.out.println("----------------------------------------------------------------------------");

        for (Libro libro : libros) {
            System.out.printf("%-40s %-30s %-4d%n", libro.getTitulo(), libro.getAutor(), libro.getAnio());
        }
    }

    private void exito(int exito){
        switch(exito){
            case 0: return;
            case -1: System.out.println("\nOlé. Datos exportados a CSV con éxito."); return;
            case -2: System.out.println("\nOlé. Datos exportados a JSON con éxito."); return;
            case -3: System.out.println("\nOlé. Datos importados de JSON con éxito."); return;
            case -4: System.out.println("\nOlé. Datos importados de CSV con éxito."); return;
            case -5: System.out.println("\nOlé. Datos exportados a XML con éxito."); return;
            case -6: System.out.println("\nOlé. Datos importados de XML con éxito."); return;
        }
    }

    public void error(int error){
        switch(error){
            case 0: return;
            case 1: System.out.println("\nESPABILA. No existe el archivo"); return;
            case 2: System.out.println("\nESPABILA. Es un directorio no un archivo."); return;
            case 3: System.out.println("\nESPABILA. No se ha podido exportar el archivo."); return;
            case 4: System.out.println("\nESPABILA. No se ha podido importar el archivo."); return;
            case 5: System.out.println("\nESPABILA. No se ha encontrado el libro que desea eliminar."); return;
            case 6: System.out.println("\nESPABILA. No se ha encontrado el libro que desea modificar."); return;
            case 7: System.out.println("\nESPABILA. No existe el archivo CSV."); return;
            case 8: System.out.println("\nESPABILA. Es un directorio no un archivo CSV."); return;
            case 9: System.out.println("\nESPABILA. No se ha podido exportar el archivo CSV."); return;
            case 10: System.out.println("\nESPABILA. No existe el archivo JSON."); return;
            case 11: System.out.println("\nESPABILA. Es un directorio no un archivo JSON."); return;
            case 12: System.out.println("\nESPABILA. No se ha podido exportar el archivo JSON."); return;
            case 13: System.out.println("\nESPABILA. No sepuede improtar del archivo JSON."); return;
            case 14: System.out.println("\nESPABILA. No se ha podido importar el archivo CSV."); return;
            case 15: System.out.println("\nESPABILA. No se ha podido exportar el archivo XML."); return;
            case 16: System.out.println("\nESPABILA. No se ha podido importar el archivo XML."); return;
            case 17: System.out.println("\nESPABILA. No existe el archivo XML."); return;
            case 18: System.out.println("\nESPABILA. Es un directorio no un archivo XML."); return;

        }
    }

    private void salir(){
        System.out.println("\n\nHasta luego.");
    }
}

