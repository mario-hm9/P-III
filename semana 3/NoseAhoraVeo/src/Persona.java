public class Persona {

    String nombre;
    double pesoo;
    double altura;

    public Persona(){
        this.nombre = "Pin";
        
    }

    public Persona(String nombre){
        this.nombre = nombre;
    }

   public String getNombre(){
       return this.nombre;
   }
}
