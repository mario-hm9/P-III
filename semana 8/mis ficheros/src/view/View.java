package view;
import com.coti.tools.Esdia;
import model.Partido;
import controller.Controller;
import java.util.ArrayList;

public class View {

    Controller controller;

    public void setController(Controller controller){
        this.controller = controller;
    }

    public void menu() {

        int opcion;
        boolean salir = true;

        do {
            System.out.println("1. Mostrar quiniela");
            System.out.println("2. Salir");
            opcion = Esdia.readInt("Introduce una opción: ",1,2);
            switch(opcion){
    
                case 1: mostrarQuiniela(); break;
                case 2: salir = false; break;
            }
        } while (salir);
        
    }

    public void errorInit(){
        System.err.println("\nESPABILA, no se puede iniciar el programa porque la ruta dada es incorrecta.");
    }

    public void errorCargarPartidos(){
        System.err.println("\nESPABILA, error al cargar partidos.");
    }

    public void mostrarQuiniela(){
        ArrayList<Partido> partidos = controller.getPartidos();
        System.out.println("\n ------------------ QUINIELA ------------------\n");

        for(Partido p : partidos){
            System.out.printf("%20s %d - %d %-15s - %s\n", p.getLocal(), p.getGolesLocal(), p.getGolesVisitante(), p.getVisitante(), p.getResultado());
        }

        System.out.println("\n ----------------------------------------------\n");

    }
    
}
