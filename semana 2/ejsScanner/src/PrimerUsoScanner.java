import java.util.Scanner;

public class PrimerUsoScanner {
    public static void main(String[] args) throws Exception {
        Scanner escaner = new Scanner(System.in);

        System.out.print("Introduzca año de nacimiento: ");
        int ano1 = escaner.nextInt();
        System.out.print("Introduzca año actual: ");
        int ano2 = escaner.nextInt();

        int edad = ano2 - ano1;

        System.out.println("La edad es: " + edad);


        escaner.close();
    }
}
