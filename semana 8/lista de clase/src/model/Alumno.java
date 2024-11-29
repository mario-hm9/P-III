package model;

import java.util.ArrayList;

public class Alumno {
    
    private DatosPersonales datosPersonales;
    private Direccion direccion;

    public Alumno(ArrayList<Alumno> alumnos) {

        DatosPersonales datosPersonales = DatosPersonales.factory(alumnos);
        Direccion direccion = Direccion.factory();

        this.datosPersonales=datosPersonales;
        this.direccion = direccion;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public String toString(String elimitador){
        return String.format("%s"+elimitador+"%s"+elimitador+"%d"+elimitador+"%s"+elimitador+"%s"+elimitador+"%s"+elimitador+"%d"+elimitador+"%s",
            datosPersonales.getNombre(),
            datosPersonales.getApellidos(),
            datosPersonales.getEdad(),
            datosPersonales.getNIF(),
            direccion.getCalle(),
            direccion.getNumero(),
            direccion.getPiso(),
            direccion.getLetra()
        );
    }
}
