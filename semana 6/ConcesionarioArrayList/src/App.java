import java.util.ArrayList;
import java.util.Iterator;

import com.coti.tools.Esdia;

public class App {

    private static ArrayList<Coche> coches = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        String opcion;
        do {
            System.out.println("\n--- MENU CRUD ---");
            System.out.println("1. Agregar persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Modificar persona");
            System.out.println("4. Listar personas");
            System.out.println("5. Salir");
            opcion = Esdia.readString("Ingrese una opción: ");

            switch (opcion) {
                case "1":
                    agregarPersona();
                    break;
                case "2":
                    eliminarPersona();
                    eliminarPersonaIterator();
                    break;
                case "3":
                    //modificarPersona();
                    modificarPersonaIterator();
                    break;
                case "4":
                    listarPersonas();
                    break;
                case "5":
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!opcion.equals("5"));
    }    

    private static void agregarPersona(){
        String marca = Esdia.readString("\nIntroduzca la marca del coche: ");
        String modelo= Esdia.readString("Introduzca el modelo del coche: ");
        String color = Esdia.readString("Introduzca el color del coche: ");
        coches.add(new Coche(marca, modelo, color));
    }

    private static void eliminarPersona(){
        String marca = Esdia.readString("\nDigame cuál es la marca que quiere elimianr: ");
        String modelo = Esdia.readString("\nDigame cuál es el modelo que quiere elimianr: ");
        Coche cocheBorrar = null;

        for(Coche coche : coches){
            if(coche.getMarca().equalsIgnoreCase(marca) && coche.getModelo().equalsIgnoreCase(modelo)){
                cocheBorrar=coche;
            }
        }

        if(cocheBorrar!=null){
            coches.remove(cocheBorrar);
            System.out.println("Coche eliminado.");
        } else{
            System.out.println("Coche no encnotrado en la lista.");
        }
    }

    private static void eliminarPersonaIterator(){
        String marca = Esdia.readString("\nDigame cuál es la marca que quiere elimianr: ");
        String modelo = Esdia.readString("\nDigame cuál es el modelo que quiere elimianr: ");
        boolean encontrado = false;
        Iterator<Coche> iterator = coches.iterator();

        Coche coche = null;

        while(iterator.hasNext()){
            coche=iterator.next();
            if(coche.getMarca().equalsIgnoreCase(marca) && coche.getModelo().equalsIgnoreCase(modelo)){
                coches.remove(coche);
                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.println("Coche no encontrado.");
        } else {
            System.out.println("Coche eliminado.");
        }
    }

    private static void modificarPersona(){
        String marca = Esdia.readString("\nDigame cuál es la marca que quiere modificar: ");
        String modelo = Esdia.readString("\nDigame cuál es el modelo que quiere modificar: ");
        Coche cocheMod = null;

        for(Coche coche : coches){
            if(coche.getMarca().equalsIgnoreCase(marca) && coche.getModelo().equalsIgnoreCase(modelo)){
                cocheMod=coche;
                break;
            }
        }

        if(cocheMod!=null){
            String color = Esdia.readString("\nDigame cual es el nuevo color que le quiere otorgar: ");
            cocheMod.setColor(color);
        } else {
            System.out.println("Modelo y marca de coche no encontrados.");
        }

    }

    private static void modificarPersonaIterator(){
        String marca = Esdia.readString("\nDigame cuál es la marca que quiere modificar: ");
        String modelo = Esdia.readString("\nDigame cuál es el modelo que quiere modificar: ");
        Iterator<Coche> iterator = coches.iterator();
        Coche cocheMod=null;
        boolean encontrado=false;

        while(iterator.hasNext()){
            cocheMod=iterator.next();
            if(cocheMod.getMarca().equalsIgnoreCase(marca) && cocheMod.getModelo().equalsIgnoreCase(modelo)){
                String color = Esdia.readString("\nDigame cual es el nuevo color que le quiere otorgar: ");
                cocheMod.setColor(color);
                encontrado=true;
                break;
            }
        }

        if(!encontrado){
            System.out.println("Coche no encontrado.");
        } else {
            System.out.println("Coche modificado.");
        }
    }
    
    private static void listarPersonas(){
        
        if(coches.isEmpty()){
            System.out.println("Lista vacía.");
        } else{
            for (Coche coche : coches){
                System.out.println(coche.imprimirLista());
            }
        }


    }
}
