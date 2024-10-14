public class LimpiarPantalla {
    
    public static void limpiarPantalla() {
        try {
            if ( System.getProperty("os.name").toLowerCase().contains("windows")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            } else if ( System.getProperty("os.name").toLowerCase().contains ("linux") ){ 
                    new ProcessBuilder("clear").inheritIO().start().waitFor();
                }   

            else {
                System.out.println("Sistema operativo no soportado");
            }
            
        } catch (Exception e) {
            System.out.println("Error al limpiar la pantalla");
        }
    }
}
