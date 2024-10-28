import java.util.HashSet;
import com.coti.tools.Esdia;

public class App {

    private static HashSet<Coche> coches = new HashSet<>();
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
                    //modificarPersona();
                    break;
                case 4:
                    //listarPersonas();
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
        String marca     = Esdia.readString_ne("\nIntroduzca la marca del coche.");
        String modelo    = Esdia.readString_ne("\nIntroduzca el modelo del coche.");
        String color     = Esdia.readString_ne("\nIntroduzca el color del coche.");

        if(!coches.add(new Coche(marca, modelo, color))){
            System.out.println("Ya existe ese coche en la lista.");
        }
    }

    private static void eliminarPersona(){
            
    }
}
