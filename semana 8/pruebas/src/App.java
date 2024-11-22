import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Path ruta = Paths.get(System.getProperty("user.home"), "Escritorio", "datos.txt");
        File rutaref = ruta.toFile();

        if(!rutaref.exists() || rutaref.isDirectory()){
            System.err.println("\nESPABILA, archivo no existente.\n");
            return;
        }

        Scanner scanner = new Scanner(rutaref);

        String valor = scanner.nextLine();
        System.out.println(valor);
        int = scanner.nextInt();
        System.out.println(valor);

        int i = scanner.nextInt();
        System.out.println(i);


        scanner.close();
    }
}           