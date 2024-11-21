package view;
import java.util.HashMap;
import java.util.Map;

import com.coti.tools.Esdia;
import controller.Controller;

public class View {
    
    int opcion;
    boolean flag = false;

    Controller controller;

    public void menu(){
        do {
            System.out.println("\n1.- Leer tabla de ventas\n" + //
                            "2.- Leer tabla de precios\n" + //
                            "3.- Calcular ingresos totales\n" + //
                            "4.- Mostrar resultados\n" + //
                            "5.- Salir\n");

            opcion = Esdia.readInt("Introduzca la opcion que desea: ",1,5);

            switch(opcion){
                case 1: controller.leerVentas(); break;
                case 2: controller.leerPrecios(); break;
                case 3: calcularIngresos(); break;
                case 4: mostrar(); break;
                case 5: flag = true; break;
                default: System.out.println("\nMal introducido, repita. ");
            }
        } while(!flag);
    }

    void calcularIngresos(){
        double ingresos;
        if( 0 > (ingresos = controller.calcularIngresos())){
            System.out.println("\nNo has introducido los datos. Mételos si quieres que te calcule las cosas.");
        } else {
            System.out.printf("\nLos ingresos totales de las alpargatas y frigopies de los 5 almacenes son: %.2f €\n",ingresos);
        }
    }

    public void setController(Controller controller){
        this.controller = controller;
    }

    public void mostrar(){
        HashMap<Integer, Double> alpargatas = controller.mis_Alpargatas();
        HashMap<Integer, Double> frigopies  = controller.mis_Frigopies();

        int key, i=1;

        for(Map.Entry<Integer,Double> entry : alpargatas.entrySet()){
            key = entry.getKey();
            System.out.printf ("\n-------------------------- Almacén %d --------------------------\n",i);
            System.out.printf   ("     Alpargatas:   %-5.0f", alpargatas.get(key));
            System.out.printf   ("                   Frigopies:  %.0f\n\n", frigopies.get(key));
            i++;
        }
    }
    
}
