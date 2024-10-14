import com.coti.tools.Esdia;

public class Menu {

    public static String menu(){

        String opcion;
        boolean salida = true;

        do{
            System.out.println("|-----------------------------------------------------|");
            System.out.println("| MIS LIBROS                                          |");
            System.out.println("|-----------------------------------------------------|");
            System.out.println("     1)    Nuevo almacén de libros");
            System.out.println("     2)    Introducir ritmo de lectura");
            System.out.println("     3)    Añadir un nuevo libro al almacén");
            System.out.println("     4)    Mostrar información actual de los libros");
            System.out.println("     5)    Salir (se borrará toda la información)");
            System.out.println("|-----------------------------------------------------|\n");
            System.out.println("Seleccione una opción (1-5): ");
            System.out.print("Opción seleccionada: ");
            
            opcion = Esdia.readString("");

            if (opcion.equals("1") || opcion.equals("2") || opcion.equals("3") || opcion.equals("4") || opcion.equals("5")) {
                return opcion;
            } else{
                    System.out.print("\n¡¡¡ESPABILA!!! Escoja una opción válida. Repita en 3... ");
                    long tiempo = System.currentTimeMillis() + 1000;
                    while (System.currentTimeMillis() < tiempo) {
                    }
                    System.out.print("2... ");
                    tiempo = System.currentTimeMillis() + 1000;
                    while (System.currentTimeMillis() < tiempo) {
                    }
                    System.out.print("1... ");
                    tiempo = System.currentTimeMillis() + 1000;
                    while (System.currentTimeMillis() < tiempo) {
                    }

                    LimpiarPantalla.limpiarPantalla();

                    salida = false;
                    
                }
              

        } while (!salida);

        return opcion;
                
    } 

}
