import java.io.Console;

public class PrimerUsoConsole {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Console consola = System.console();

        if(consola == null){
            System.err.println("Error al crear consola.");
            return;
        }

        String anio_nacimiento = consola.readLine("Inserte el año de nacimiento: ");
        int anio_nacimiento2 = Integer.parseInt(anio_nacimiento);

        String anio_actual = consola.readLine("Inserte el año actual: ");
        int anio_actual2 = Integer.parseInt(anio_actual);

        int edad = anio_actual2 - anio_nacimiento2;
        
        System.out.println("La edad es: " + edad);
    }
}
    