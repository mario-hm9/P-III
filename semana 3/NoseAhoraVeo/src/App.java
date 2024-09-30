import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Persona p1 = new Persona("Pin");
        Persona p2 = new Persona("Pon");
        Persona p3 = new Persona("Pen");

        System.out.println("El nombre de p1 es: " + p1.getNombre());
        System.out.println("El nombre de p2 es: " + p2.getNombre());
        System.out.println("El nombre de p3 es: " + p3.getNombre());

    }
}
