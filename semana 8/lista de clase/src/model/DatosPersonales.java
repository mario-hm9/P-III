package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DatosPersonales {
    
    private String nombre;
    private String apellidos;
    private int edad;
    private String nif;

    public DatosPersonales(String nombre, String apellidos, int edad, String nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nif = nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getNIF() {
        return nif;
    }

    public static String generarNif(ArrayList<Alumno> alumnos){

        List<String> letras = List.of(
            "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D",
            "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", 
            "C", "K", "E"
        );

        Random random = new Random();
        int nif, aleatorio;
        boolean salir;
        String nifFinal;

        do{
            nif=0;
            salir = true;
            
            for(int i = 0; i < 8; i++){
                aleatorio = random.nextInt(10);
                nif = nif*10 + aleatorio;
            }

            String letra = letras.get(nif%23);

            List <String> tmp = List.of(String.valueOf(nif), letra);

            nifFinal = tmp.get(0)+tmp.get(1);

            if(nifFinal.length() != 9)
                nifFinal = 0 + nifFinal;

            for(Alumno alumno : alumnos){
                if(alumno.getDatosPersonales().getNIF() == letra ){
                    salir = false;
                    break;
                }
            }
        } while(!salir);

        return nifFinal;
    }

    public static DatosPersonales factory(ArrayList<Alumno> alumnos){

        List<String> nombres = List.of(
            "Juan", "María", "Pedro", "Ana", "Luis", 
            "Lucía", "Carlos", "Sofía", "Miguel", "Carmen",
            "Javier", "Laura", "Antonio", "Elena", "Pablo",
            "Isabel", "José", "Rosa", "Diego", "Clara"
        );

        List<String> apellidos = List.of(
            "García", "Martínez", "López", "Sánchez", "Pérez", 
            "Rodríguez", "Fernández", "González", "Hernández", "Jiménez",
            "Ruiz", "Díaz", "Álvarez", "Romero", "Torres",
            "Vázquez", "Castro", "Ortiz", "Moreno", "Ramos"
        );
      

        Random random = new Random();
        int aleatorio = random.nextInt(nombres.size()); 
        String nombre = nombres.get(aleatorio);

        aleatorio = random.nextInt(apellidos.size());
        String apellido1 = apellidos.get(aleatorio);

        aleatorio = random.nextInt(apellidos.size());
        String apellido2 = apellidos.get(aleatorio);

        String apellido = apellido1 + " " + apellido2;
        
        aleatorio = random.nextInt(95);

        return new DatosPersonales(nombre, apellido, aleatorio, generarNif(alumnos));
    }

    
}
