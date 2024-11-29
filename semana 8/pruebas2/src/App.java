import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<String> letras = List.of(
            "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D",
            "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", 
            "C", "K", "E"
        );

        int nif=0, aleatorio;
        Random random = new Random();
        for(int i = 0; i < 8; i++){
            aleatorio = random.nextInt(10);
            nif = nif*10 + aleatorio;
        }

        String letra = letras.get(nif%23);

        List <String> tmp = List.of(String.valueOf(nif), letra);

        letra = tmp.get(0)+tmp.get(1);

        System.out.println("NIF: "+letra);


    }
}
