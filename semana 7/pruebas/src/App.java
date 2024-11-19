
public class App {
    
    public static void main(String[] args) {
        int numero = 123;
        String texto = "Hola Mundo";
        // Alineación de un número entero a la izquierda
        System.out.printf("|%-10d|%n", numero);  // El número se alinea a la izquierda con un espacio de 10 caracteres

        // Alineación de una cadena de texto a la izquierda
        System.out.printf("|%-10s|%n", texto);   // El texto se alinea a la izquierda con un espacio de 15 caracteres
    }
}
