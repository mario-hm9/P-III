import java.util.ArrayList;

public class BuscadorEratostenes extends BuscadorPrimos{

    public BuscadorEratostenes(String nombre, int limite) {
        super(nombre, limite);
    }
    
    @Override
    public ArrayList<Integer> calcularPrimos(int n){
        boolean[] esPrimo = new boolean[n + 1];
        ArrayList<Integer> primos = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            esPrimo[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (esPrimo[p]) {
                for (int i = p * p; i <= n; i += p) {
                    esPrimo[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (esPrimo[i]) {
                primos.add(i);
            }
        }

        return primos;
    }
}
