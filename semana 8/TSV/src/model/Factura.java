package model;

public class Factura {

    private String[] concepto;
    private double descuento;
    private String[] fecha;
    private double importe;
    private String[] nif;
    private String[] nombre;

    
    public void setConcepto(String[] concepto) {
        this.concepto = concepto;
    }

    public void setFecha(String[] fecha) {
        this.fecha = fecha;
    }

    public void setNif(String[] nif) {
        this.nif = nif;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String[] direccion) {
        this.direccion = direccion;
    }

    private String[] direccion;
    private double iva;
    private double resultado;
       

    public Factura(double descuento, double importe, double iva, double resultado) {
        this.descuento = descuento;
        this.importe = importe;
        this.iva = iva;
        this.resultado = resultado;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getImporte() {
        return importe;
    }

    public double getIva() {
        return iva;
    }

    public double getResultado(){
        return resultado;
    }

    public String[] getConcepto() {
        return concepto;
    }

    public String[] getFecha() {
        return fecha;
    }

    public String[] getNif() {
        return nif;
    }

    public String[] getNombre() {
        return nombre;
    }

    public String[] getDireccion() {
        return direccion;
    }

    

}
