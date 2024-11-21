package model;

public class Partido {

    private String local;
    private String visitante;
    private int golesLocal;
    private int golesVisitante;
    private String resultado;


    public Partido(String local, String visitante) {
        this.local = local;
        this.visitante = visitante;
    }


    public String getLocal() {
        return local;
    }


    public String getVisitante() {
        return visitante;
    }
    

    public int getGolesLocal() {
        return golesLocal;
    }


    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }


    public int getGolesVisitante() {
        return golesVisitante;
    }


    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }


    public String getResultado() {
        return resultado;
    }


    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    
}
