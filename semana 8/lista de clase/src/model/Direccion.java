package model;

import java.util.List;
import java.util.Random;

public class Direccion {

    private String calle;
    private int numero;
    private int piso;
    private String letra;

    public Direccion (String calle, int numero, int piso, String letra) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.letra = letra;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public int getPiso() {
        return piso;
    }

    public String getLetra() {
        return letra;
    }

    public static Direccion factory(){

        List<String> calles = List.of(
            "Calle Toro", "Calle Zamora", "Calle Gran Vía", "Paseo de la Estación", 
            "Avenida de Portugal", "Calle Mayor", "Rúa Antigua", "Paseo de San Vicente", 
            "Calle Meléndez", "Calle Libreros", "Calle de los Tilos", "Calle San Pablo", 
            "Paseo Canalejas", "Avenida de Mirat", "Calle de la Compañía", "Calle Rector Tovar", 
            "Plaza Mayor", "Calle Pozo Amarillo", "Calle Peña de Francia", "Calle Veracruz"
        );

        List<String> letras= List.of("A","B","C","A", "B", "A", "D");

        Random random = new Random();
        
        int aleatorio = random.nextInt(20);
        String calle = calles.get(aleatorio);
        int numero = random.nextInt(35) +1;
        int piso = random.nextInt(7);
        aleatorio = random.nextInt(7);
        String letra = letras.get(aleatorio);

        return new Direccion(calle,numero,piso,letra);
        
    }
}
