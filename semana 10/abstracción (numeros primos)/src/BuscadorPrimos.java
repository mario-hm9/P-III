import java.time.Instant;
import java.util.ArrayList;
import java.time.Duration;

abstract class BuscadorPrimos {

    private String nombre;
    private int limite;
    private long tiempo;
    private int cantidad_primos;

    ArrayList<Integer> primos = new ArrayList<>();

    public void calcular(){
        Instant inicio = Instant.now();
        primos = calcularPrimos(limite);
        Instant fin = Instant.now();
        this.tiempo = Duration.between(inicio,fin).toNanos();
        this.cantidad_primos = primos.size();
    }

    public abstract ArrayList<Integer> calcularPrimos(int limite);

    public BuscadorPrimos(String nombre, int limite) {
        this.nombre = nombre;
        this.limite = limite;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTiempo() {
        return tiempo;
    }

    public int getCantidad_primos() {
        return cantidad_primos;
    }

    
    
}
