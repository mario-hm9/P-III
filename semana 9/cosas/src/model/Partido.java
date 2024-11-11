package model;

public class Partido {
    
    private String equipoLocal;
    private String equipoVisitante;
    private int goleslocal;
    private int golesVisitante;
    private String resultados; // X , 1, 2


    //click derecho source nosequé crear constructores -> seleccionar variables
    public Partido(String equipoLocal, String equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }


    public String getEquipoLocal() {
        return equipoLocal;
    }


    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }


    public String getEquipoVisitante() {
        return equipoVisitante;
    }


    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }


    public int getGoleslocal() {
        return goleslocal;
    }


    public void setGoleslocal(int goleslocal) {
        this.goleslocal = goleslocal;
    }


    public int getGolesVisitante() {
        return golesVisitante;
    }


    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }


    public String getResultados() {
        return resultados;
    }


    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    

    
}
