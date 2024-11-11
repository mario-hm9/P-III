package view;

import controller.Controller;
import model.Partido;

import java.util.ArrayList;

import com.coti.tools.Esdia;

public class View {

    Controller controller;

    

    public void mostrarMenuPrincipal(){
        boolean salir = false;

        do {

            System.out.println("1. Cargar partidos desde archivos (equipos.txt)");
            System.out.println("2. introducir resultados para los partidos cargados");
            System.out.println("3. Mostrar quiniela con resultados;");
            System.out.println("4. Salir");
           

            //leer numero int entre 1 y 4
            int opcion = Esdia.readInt("Introduce una opción", 1,4);

            switch (opcion) {
                case 1: 
                //controller.cargarPartidoArchivo();
                break;
                case 2:
                    leerResultadosDePartido();
                    break;
                case 3:
                    mostrarQuinielaPorPantalla();
                    break;
                case 4:
                    salir = true;
            }
        } while (salir);
    }



    public void mostrarResultado(int resultado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarResultado'");
    }

    public void leerResultadosDePartido(){

        ArrayList<Partido> partidos = controller.getPartidos();

        if(partidos.size() > 0){
            for(Partido partido : partidos){
                int golesLocal = Esdia.readInt("Introduce goles del equipo local: ");
                int golesVisitante = Esdia.readInt("Introduce goles del equipo visitante: ");

                //metodo que guarda rewsultados en el modelo
                partido.setResultado(goleslocal, golesVisitante);
            }
        }
    }


    void mostrarQuinielaPorPantalla(){
        
    }
    
}
