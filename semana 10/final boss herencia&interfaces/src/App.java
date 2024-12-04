import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Archivo> archivos = new ArrayList<Archivo>();

        archivos.add(new Imagen("foto1", 100));
        archivos.add(new APK("app1", 200));
        archivos.add(new Documento("documento 1", 300)); 

        for(Archivo archivo : archivos){
            if(archivo instanceof Imprimible){
                ((Imprimible)archivo).imprimir();
            } else if(archivo instanceof Compartible){
                ((Compartible)archivo).compartir("Facebook");
            } else {
                System.out.println("Archivo no imprimible ni compartible");
            }
        }
    }
}
