import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {


        ArrayList<BuscadorPrimos>  buscadores = new ArrayList<>();

        BuscadorNaive bn = new BuscadorNaive("Buscador Naive", 1000);
        BuscadorEratostenes be = new BuscadorEratostenes("Buscador Eratostenes", 1000);

        buscadores.add(bn);
        buscadores.add(be);

        for(BuscadorPrimos b : buscadores){
            b.calcular();
            System.out.println(b.primos+ " "+b.getTiempo() + " "+b.getNombre()+"\n\n");    
        }
        

    }
}
