import java.util.HashMap;
import java.util.Map;

import com.coti.tools.Esdia;

public class App {

private static HashMap<String, Coche> coches = new HashMap<String, Coche>();

    public static void main(String[] args) throws Exception {
        
        int opcion;
        do {
            System.out.println("\n--- MENU CRUD ---");
            System.out.println("1. Agregar persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Modificar persona");
            System.out.println("4. Listar personas");
            System.out.println("5. Salir");
            opcion = Esdia.readInt("Ingrese una opción: ");

            switch (opcion) {
                case 1:
                    agregarPersona();
                    break;
                case 2:
                    eliminarPersona();
                    break;
                case 3:
                    modificarPersona();
                    break;
                case 4:
                    listarPersonas();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    private static void agregarPersona(){
        String matricula = Esdia.readString_ne("\nIntroduzca la matricula del coche.");
        String marca     = Esdia.readString_ne("\nIntroduzca la marca del coche.");
        String modelo    = Esdia.readString_ne("\nIntroduzca el modelo del coche.");
        String color     = Esdia.readString_ne("\nIntroduzca el color del coche.");

        coches.put(matricula, new Coche(marca,modelo,color));
    }

    private static void eliminarPersona(){
        String matricula = Esdia.readString_ne("Introduzca la matricula del coche que desea eliminar: ");
        if(coches.containsKey(matricula)){
            coches.remove(matricula);
            System.out.println("Elemento borrado.");
        } else{
            System.out.println("Coche no encontrado.");
        } 
    }

    private static void modificarPersona(){
        String matricula = Esdia.readString_ne("Introduzca la matricula a modificar:");
        if(coches.containsKey(matricula)){
            String marca     = Esdia.readString_ne("\nIntroduzca la marca del coche.");
            String modelo    = Esdia.readString_ne("\nIntroduzca el modelo del coche.");
            String color     = Esdia.readString_ne("\nIntroduzca el color del coche.");

            coches.put(matricula, new Coche(marca,modelo,color));
        } else{
            System.out.println("Coche no encontrado.");
        }
    }

    private static void listarPersonas(){
        if(coches.isEmpty()){
            System.out.println("No hay elementos en la lista,");
            return;
        }
        for(Map.Entry<String, Coche> entry : coches.entrySet()){
            String key = entry.getKey();
            Coche coche = entry.getValue();
            System.out.println(String.format("\nMatricula : %s    Marca: %s    Modelo: %s    Color: %s", key, coche.getMarca(), coche.getModelo(), coche.getColor()));
        }
    }
}
