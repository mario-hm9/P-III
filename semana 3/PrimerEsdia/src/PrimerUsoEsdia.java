import com.coti.tools.Esdia;

public class PrimerUsoEsdia {
    public static void main(String[] args) throws Exception {
        
        int anioActual, anioNacimiento, edad;
        
        do {
            anioNacimiento = Esdia.readInt("Introduce tu año de nacimiento: ");
            if (anioNacimiento < 0) {
                System.err.println("El año de nacimiento no puede ser negativo.");
            }
        } while (anioNacimiento < 0);

        do {
            anioActual = Esdia.readInt("Introduce el año actual: ");
            if (anioActual < anioNacimiento ) {
                System.err.println("El año actual no puede ser menor que el año de nacimiento.");
            }
        
        } while (anioActual < anioNacimiento);

        edad = anioActual - anioNacimiento;
        System.out.println("Tienes "+edad+" años.");
    }
}
