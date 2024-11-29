package view;

import controller.Controller;
import model.Alumno;
import model.DatosPersonales;
import model.Direccion;

import java.util.ArrayList;

import com.coti.tools.Esdia;

public class View {

    Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void menu(){
        
        boolean salir = false, creada = false;
        int opcion;

        do {

            System.out.println("1. Volver a crear la lista de alumnos");
            System.out.println("2. Mostrar tabla de alumnos");
            System.out.println("3. Exportar datos personales (CSV)");
            System.out.println("4. Exportar direcciones (CSV)");
            System.out.println("5. Salir");
            opcion = Esdia.readInt("\nIntroduzca una opcion: ");

            switch (opcion) {
                case 1: crearListaAlumnos(); creada = true; break;
                case 2: if(!creada) {System.out.println("\nNecesita primero crear lista\n"); break; } mostrarTabla(); break;
                case 3: if(!creada) {System.out.println("\nNecesita primero crear lista\n"); break; }exportarDatosCSV(); break;
                case 4: if(!creada) {System.out.println("\nNecesita primero crear lista\n"); break; }exportarDireccionesCSV();  break;
                case 5: salir = true; break;
                default: System.out.println("Opción no válida");  break;
            }
        } while (!salir);

    }

    private void exportarDatosCSV() {
        if(!controller.exportarDatosCSV()){
            System.err.println("ESPABILA, error al exportar el archivo");
        } else {
            System.out.println("Archivo exportado correctamente");
        }
    }

    private void exportarDireccionesCSV() {

        if(!controller.exportarDireccionesCSV()){
            System.err.println("ESPABILA, error al exportar el archivo");
        } else {
            System.out.println("Archivo exportado correctamente");
        }
    }

    private void crearListaAlumnos() {
        controller.crearListaAlumnos();
        System.out.println("\nLista de alumnos creada correctamente\n");
    }

    private void mostrarTabla(){

        ArrayList<Alumno> alumnos = controller.getAlumnos();

        if (alumnos.isEmpty()) {
        System.out.println("No hay alumnos para mostrar.");
        return;
        }

        System.out.println("\n\n");

        System.out.printf("%-20s %-20s %-10s %-15s %-30s\n", "Nombre", "Apellidos", "Edad", "NIF", "Dirección");
        System.out.println("------------------------------------------------------------------------------------------------------------");

        for (Alumno alumno : alumnos) {
            DatosPersonales dp = alumno.getDatosPersonales();
            Direccion direccion = alumno.getDireccion();
            System.out.printf("%-20s %-20s %-10d %-15s %-30s\n", 
                dp.getNombre(), 
                dp.getApellidos(), 
                dp.getEdad(), 
                dp.getNIF(), 
                direccion.getCalle() + ", " + direccion.getNumero() + ", " + direccion.getPiso() + ", " + direccion.getLetra()
            );
        }

        System.out.println("\n\n");

    }
    
}
