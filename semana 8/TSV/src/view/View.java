package view;

import controller.Controller;
import com.coti.tools.Esdia;
import java.util.ArrayList;
import java.util.Arrays;

import model.Factura;

public class View {
    
    Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void errorPath() {
        System.err.println("\nESPABILA error en la ruta del archivo.");
        return;
    }

    public void menu(){
        int opcion;
        boolean salir = true;

        do{
            System.out.println("1. Insertar valor");
            System.out.println("2. Exportar html");
            System.out.println("3. Exportar csv");
            System.out.println("4. Salir");
            System.out.println("Introduce una opcion: ");

            opcion = Esdia.readInt("Introduce una opcion: ",1,5);
            switch(opcion){
                case 1: insertaValor(); break;
                case 2: //controller.exportar(); break;
                case 3: //controller.exportarCSV(); break;
                case 4: salir = false; break;
                default: System.out.println("Opcion no valida");
            }
        } while(salir);
    }

    public void insertaValor(){
        double descuento = Esdia.readDouble("Introduce el descuento: ");
        double importe = Esdia.readDouble("Introduce el importe: ");
        double iva = Esdia.readDouble("Introduce el iva: ");
        double minimo = importe * (1 - descuento) * (1 + iva);
        controller.sacarDatos(minimo);

    }

    public void errorLineas() {
        System.err.println("\nESPABILA error en las lineas del archivo.");
        return;
    }

    public void verFactorasMinimo(ArrayList<Factura> facturas){
    for(Factura f : facturas){
        System.out.printf("%20s %5.2f %20s %5.2f %20s %20s %20s %3.2f\n",
            Arrays.toString(f.getConcepto()),
            f.getDescuento(),
            Arrays.toString(f.getFecha()),
            f.getImporte(),
            Arrays.toString(f.getNif()),
            Arrays.toString(f.getNombre()),
            Arrays.toString(f.getDireccion()),
            f.getResultado()
        );
    }
}
}
