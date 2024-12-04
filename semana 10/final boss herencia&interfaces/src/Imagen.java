public class Imagen extends Archivo implements Compartible{
    
    public Imagen(String nombre, int tamanio){
        super(nombre, tamanio);
    }

    public void compartir(String plataforma){
        System.out.println("Compartiendo imagen en " + plataforma);
    }   
}
