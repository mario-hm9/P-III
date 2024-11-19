package model;

import java.util.HashMap;
import java.util.Map;
import java.io.Console;


public class Model {

private HashMap<Integer, Double> alpargatas;
private HashMap<Integer, Double> frigopies;

double alpargata;
double frigopie;

    public Model(){
        this.alpargatas =  new HashMap <>();
        this.frigopies = new HashMap <>();
    }

    public void leerVentas(){

        Console consola = System.console();
        String parse;
        double venta;

        for(int i=1; i<6; i++){
            parse = consola.readLine("\nIntroduzca las ventas de la alpargata en el almacén "+ i +": ");
            venta = Double.parseDouble(parse);
            alpargatas.put(i, venta);

            parse = consola.readLine("Introduzca las ventas del frigopie en el almacén "+ i +": ");
            venta = Double.parseDouble(parse);
            frigopies.put(i,venta);
        }

    }

    public void leerPrecios(){

        Console consola = System.console();
        String parse;
        double alpargata;
        double frigopie;

        parse = consola.readLine("\nIntroduzca el precio de cada alpargata: ");
        alpargata = Double.parseDouble(parse);

        parse = consola.readLine("Introduzca el precio de cada frigopie: ");
        frigopie = Double.parseDouble(parse);

        setFrigopie(frigopie);
        setAlpargata(alpargata);

    }

    public double calcularIngresos(){

        if(alpargatas.isEmpty()){
            return -1;
        }

        double ingresosAlpargatas = 0;
        double ingresosFrigopies  = 0;

        for(Map.Entry<Integer, Double> entry : alpargatas.entrySet()){
            ingresosAlpargatas += entry.getValue();
        }

        if(frigopies.isEmpty()){
            return -1;
        }

        for(Map.Entry<Integer, Double> entry : frigopies.entrySet()){
            ingresosFrigopies += entry.getValue();
        }

        return ingresosAlpargatas*this.alpargata + ingresosFrigopies*this.frigopie;
    }

    public void setAlpargata(double alpargata) {
        this.alpargata = alpargata;
    }

    public void setFrigopie(double frigopie) {
        this.frigopie = frigopie;
    }

    public HashMap<Integer, Double> getAlpargatas(){
        return alpargatas;
    }

    public HashMap<Integer, Double> getFrigopies(){
        return frigopies;
    }

}
