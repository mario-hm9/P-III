
import com.coti.tools.Esdia;

//atención ejercicio inútil basto es para acordarme de cómo se hacía!

public class Cloro {
    public static void main(String[] args) throws Exception {
        System.out.print("Dame nombre y edad: ");

        Persona persona1 = new Persona();

        String nombre = Esdia.readString("Introduzca el nombre de la persona: ");
        persona1.setNombre(nombre);
        
        int edad = Esdia.readInt("Introduzca la edad del usuario: ");
        persona1.setEdad(edad);


        System.out.println("El nombre es " +persona1.getNombre() + " y su edad es " + persona1.getEdad() + " años.");



    }
}
