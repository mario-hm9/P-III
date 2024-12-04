import java.util.ArrayList;

class BuscadorNaive extends BuscadorPrimos{

    public BuscadorNaive(String nombre, int limite) {
        super(nombre, limite);
    }

    
    public ArrayList<Integer> calcularPrimos(int n){
        for(int i=2; i<=n; i++){
            if(esPrimo(i)){
                primos.add(i);
            }
        }
        return primos;
    }

    private static boolean esPrimo(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    
    
}