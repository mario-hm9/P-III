import java.util.ArrayList;

public abstract class BuscadorPrimos{

    String nombre;
    int limite;
    long tiempoRequerido;
    int cantidadPrimos;


    public BuscadorPrimos(String nombre, int limite){
        this.nombre = nombre;
        this.limite = limite;
    }

    public abstract ArrayList<Integer> calcularPrimos();

    
    public String getNombre() {
        return nombre;
    }

    public int getLimite() {
        return limite;
    }

    public long getTiempoRequerido() {
        return tiempoRequerido;
    }

    public int getCantidadPrimos() {
        return cantidadPrimos;
    }
}