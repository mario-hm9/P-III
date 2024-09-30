public class Persona {

    private String nombre;
    private double peso;
    private double altura;

    public Persona(){
        
    }

    public Persona(String nombre){
    }

   public String getNombre(){
       return this.nombre;
   }

   public void setNombre(String nombre){
       this.nombre = nombre;
   }

    public double getPeso(){
         return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
