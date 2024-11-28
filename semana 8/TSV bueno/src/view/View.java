package view;

import com.coti.tools.Esdia;
import controller.Controller;
import model.Factura;
import java.util.ArrayList;

public class View {
    
    Controller controller;

    public void setController(Controller controller){
        this.controller = controller;
    }

    public void menu(){
        //hazme un menu imprimiendo las opciones y pidiendo una opcion y llamando al metodo correcto con switch dentro de un do while con una variable que este en false si no se selecciona salir. Las opciones son: Valor mínimo, Ver listado total, Exportar html, Exportar .csv
        //sin comentar, hazlo bien ya directamente
        
        boolean salir = false;
        int opcion;

        do {
            if(!comprobarRuta())
                salir = true;

            System.out.println("1. Valor mínimo");
            System.out.println("2. Ver listado total");
            System.out.println("3. Exportar html");
            System.out.println("4. Exportar .csv");
            System.out.println("5. Salir");
            opcion = Esdia.readInt("\nIntroduzca una opcion: ");

            switch (opcion) {
                case 1: valorMinimo(); break;
                case 2: verListado(); break;
                case 3: //exportarHtml(); break;
                case 4: exportarCsv();  break;
                case 5: salir = true; break;
                default: System.out.println("Opción no válida");  break;
            }
        } while (!salir);

    }

    public boolean comprobarRuta(){
        if(!controller.comprobarRuta()){
            System.err.println("ESPABILA, error en la ruta.");
            return false;
        }
        return true;
    }

    public void valorMinimo(){

        double importe = 2000; //Esdia.readDouble("Introduce el importe: ");
        double descuento = 0.05; //Esdia.readDouble("Introduce el descuento: ");
        double iva = 0.21; //Esdia.readDouble("Introduce el importe: ");

        ArrayList<Factura> facturas = controller.valorMinimo(importe, descuento, iva);

        if(facturas.isEmpty()){
            System.out.println("No hay ningun valor que supere el minimo proporcionado.");
        } else {
            System.out.println("\n");
            for(Factura f : facturas){
                System.out.printf("%25s - %7.2f - %15s - %7.2f - %20s - %20s - %31s - %7.2f - %7.2f\n"
                                  , f.getConcepto(), f.getDescuento(), f.getCadena(),
                                    f.getImporte(), f.getNif(), f.getNombre(), f.getDireccion(), f.getIva(),
                                    f.getResultado());
            }
            System.out.println("\n\n");
        }

    }

    public void verListado(){
        ArrayList<String> lineas = controller.cogerListado();
        for(String linea : lineas){
            System.out.println(linea);
        }
        System.out.println("\n");
    }

    private void exportarCsv(){
        int err = controller.exportarCsv();
        switch (err){
            case 1: System.out.println("ESPABILA, error. No existe esa ruta"); break;
            case 2: System.out.println("ESPABILA, error. La ruta dada es un directorio, no un fichero."); break;
            case 3: System.out.println("ESPABILA, errores varios."); break;
            
        }
    }


}
