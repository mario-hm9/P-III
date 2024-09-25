import java.io.Console;

public class PrimerUsoConsole {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Console consola = System.console();

        if(consola == NULL){
            System.err.println("Error al crear consola.");
            return;
        }
    }
}
