package model;

import controller.Controller;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Model {

    Controller controller;
    Path path = Paths.get(System.getProperty("user.home"), "Escritorio", "facturas.tsv");
    Path path2 =Paths.get(System.getProperty("user.home"), "Escritorio", "exportar.csv");
    File file, file2;

    ArrayList<Factura> facturas = new ArrayList<Factura>();

    public ArrayList<Factura> valorMinimo(double importe, double descuento, double iva) {
        double minimo = importe * ( 1 - descuento) * (1 + iva);
        encontrarFacturas(minimo);
        return facturas;
    }

    private void encontrarFacturas(double minimo) {

        facturas.clear();

        try{ 
            Scanner scanner = new Scanner(file);
            String linea;
            Double resultado;

            while(scanner.hasNextLine()){

                linea = scanner.nextLine();
                String[] campos = linea.split("\\t");

                Double descuento = Double.parseDouble(campos[1]);
                Double importe = Double.parseDouble(campos[3]);
                Double iva = Double.parseDouble(campos[7]);


                if(minimo < ( resultado = importe*( 1 - descuento) * (1 + iva))){  
                    Factura factura = new Factura(campos[0], descuento, campos[2], importe, campos[4], campos[5], campos[6], iva, resultado);
                    facturas.add(factura);
                }

            }

            scanner.close();
        } catch(Exception e){
            //excepcion ya estudiada
        }
    }

    public boolean comprobarRuta(){
        try{
            this.file = path.toFile();
            if(!file.exists() || !file.isFile()){
                return false;
            }
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public ArrayList<String> cogerListado(){
        ArrayList<String> lineas = new ArrayList<>();
        String linea;
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                linea = scanner.nextLine();
                lineas.add(linea);
            }
            scanner.close();
            return lineas;
        } catch(Exception e){
            return lineas;
        }
    }

    public int exportarCsv(){        
        try{
            this.file2 = path2.toFile();
            if(!file2.exists()){
                return 1;
            } else {
                if(!file2.isFile()){
                    return 2;
                }
            }

            ArrayList<String> exportar = new ArrayList<>();
            Scanner scanner = new Scanner(file);
            String linea;

            while(scanner.hasNextLine()){
                linea = scanner.nextLine();
                String[] split = linea.split("\t");

                Double descuento = Double.parseDouble(split[1]);
                Double importe = Double.parseDouble(split[3]);
                Double iva = Double.parseDouble(split[7]);
                Double resultado = importe * (1 - descuento) * (1 + iva);

                Factura factura = new Factura(split[0], descuento, split[2], importe, split[4], split[5], split[6], iva, resultado);
                exportar.add((factura.hacerString(",")));

            }

            scanner.close();

            Files.write(path2, exportar, StandardCharsets.UTF_8);

        } catch(Exception e){
            return 3;
        }
        return 0;
    }

}
