import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear la lista de libros con datos reales
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605));
        libros.add(new Libro("El principito", "Antoine de Saint-Exupéry", 1943));
        libros.add(new Libro("La sombra del viento", "Carlos Ruiz Zafón", 2001));
        libros.add(new Libro("1984", "George Orwell", 1949));
        libros.add(new Libro("Crimen y castigo", "Fiódor Dostoyevski", 1866));
        libros.add(new Libro("El retrato de Dorian Gray", "Oscar Wilde", 1890));
        libros.add(new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1954));
        libros.add(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997));
        libros.add(new Libro("Matar a un ruiseñor", "Harper Lee", 1960));
        libros.add(new Libro("Los miserables", "Victor Hugo", 1862));
        libros.add(new Libro("Orgullo y prejuicio", "Jane Austen", 1813));
        libros.add(new Libro("Fahrenheit 451", "Ray Bradbury", 1953));
        libros.add(new Libro("Jane Eyre", "Charlotte Brontë", 1847));
        libros.add(new Libro("La metamorfosis", "Franz Kafka", 1915));
        libros.add(new Libro("El nombre de la rosa", "Umberto Eco", 1980));
        libros.add(new Libro("El alquimista", "Paulo Coelho", 1988));
        //libros.add(new Libro("El código Da Vinci", "Dan Brown", 2003));
        //libros.add(new Libro("La Iliada", "Homero", -750)); // Año aproximado
       //libros.add(new Libro("La Odisea", "Homero", -700)); // Año aproximado
        
        // Exportar la lista al archivo binario
        String rutaArchivo = obtenerRutaArchivo();
        boolean exito = exportarLibros(libros, rutaArchivo);

        // Mostrar mensaje al usuario
        if (exito) {
            System.out.println("¡Los libros se exportaron exitosamente a: " + rutaArchivo + "!");
        } else {
            System.err.println("Ocurrió un error al intentar exportar los libros.");
        }

        leer();
    }

    // Método para obtener la ruta del archivo en el escritorio
    private static String obtenerRutaArchivo() {
        String home = System.getProperty("user.home");
        return home + File.separator + "Escritorio" + File.separator + "libros.bin";
    }

    // Método para exportar la lista de libros al archivo binario
    private static boolean exportarLibros(List<Libro> libros, String rutaArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            oos.writeObject(libros); // Serializar la lista de libros
            return true;
        } catch (IOException e) {
            System.err.println("Error durante la exportación: " + e.getMessage());
            return false;
        }
    }

    private static void leer(){
        String home = System.getProperty("user.home");
        String rutaArchivo = home + File.separator + "Escritorio" + File.separator + "libros.bin";

        // Leer la lista de libros desde el archivo binario
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            
            List<Libro> libros = (List<Libro>) ois.readObject();

            // Mostrar los libros en pantalla
            System.out.println("Lista de libros deserializada:");
            libros.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

