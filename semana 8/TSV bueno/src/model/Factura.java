package model;

import java.util.Locale;

public class Factura {
    
    private String concepto;
    private double descuento;
    private String cadena;
    private double importe;
    private String nif;
    private String nombre;
    private String direccion;
    private double iva;
    private double resultado;

    public Factura(String concepto, double descuento, String cadena, double importe, String nif, String nombre, String direccion, double iva, double resultado) {
        this.concepto = concepto;
        this.descuento = descuento;
        this.cadena = cadena;
        this.importe = importe;
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.iva = iva;
        this.resultado = resultado;
    }

    public String hacerString(String delimitador){
        return String.format(Locale.ENGLISH, "%s" + delimitador + "%.2f" + delimitador + "%s" + delimitador + "%.2f" + delimitador + "%s" + delimitador + "%s" + delimitador + "%s" + delimitador + "%.2f" + delimitador + "%.2f"
                            , concepto, descuento, cadena, importe, nif, nombre, direccion, iva, resultado);
                                   
    }

    public String getConcepto() {
        return concepto;
    }

    public double getDescuento() {
        return descuento;
    }

    public String getCadena() {
        return cadena;
    }

    public double getImporte() {
        return importe;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getIva() {
        return iva;
    }

    public double getResultado(){
        return resultado;
    }

    
}
