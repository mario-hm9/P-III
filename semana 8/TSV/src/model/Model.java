package model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import controller.Controller;

public class Model {
    
    Controller controller;
    ArrayList<Factura> facturas;
    File path;
    Path ruta;

    public Model(){
        this.facturas = new ArrayList<>();
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public Path setPath() {

        this.ruta = Paths.get(System.getProperty("user.home"), "Escritorio", "facturas.tsv" );
        this.path = ruta.toFile();

        if(path.exists() && path.isFile()){
            return ruta;
        } else{
            return null;
        }
         
    }

    public void sacarDatos(double minimo, String delimitador) {
        try{
            List<String> lineas = Files.readAllLines(ruta);
            Factura f;
            Double descuento,importe,iva, resultado;
            for(String linea: lineas){

                String[] cosa = linea.split(delimitador);
                descuento = Double.parseDouble(cosa[1]);
                importe = Double.parseDouble(cosa[3]);
                iva = Double.parseDouble(cosa[7]);

                if(minimo < (resultado = importe*(1-descuento)*(1+iva))){
                    facturas.add((f = new Factura(descuento,importe,iva,resultado)));
                    f.setConcepto(new String[]{cosa[0]});
                    f.setConcepto(new String[]{cosa[2]});
                    f.setConcepto(new String[]{cosa[4]});
                    f.setConcepto(new String[]{cosa[5]});
                    f.setConcepto(new String[]{cosa[6]});
                }
            }
        } catch(IOException e){
            controller.errorLineas();
        }

        controller.verDatos(facturas);
    }
}
