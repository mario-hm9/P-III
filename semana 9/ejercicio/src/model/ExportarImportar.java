package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ExportarImportar {
    
    public static boolean exportar(File file){

        ArrayList<Libro> libros = new ArrayList<>();

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

        try {
            FileOutputStream fous = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fous);
            oos.writeObject(libros);
            oos.close();
            libros.clear();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    public static boolean importar(File file, ArrayList<Libro> libros){

        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            libros.addAll((ArrayList<Libro>) ois.readObject());
            ois.close();

        } catch (Exception e){
            return false;
        }
        
        return true;
    }
}
