public class Documento extends Archivo implements Imprimible, Compartible{
    
    public Documento(String nombre, int tamanio){
        super(nombre, tamanio);
    }

    public void imprimir(){
        System.out.println("Imprimiendo documento");
    }

    public void compartir(String plataforma){
        System.out.println("Compartiendo documento en " + plataforma);
    }

}
