public class Coches {
    

    private String marca;
    private String modelo;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
       this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static Coches anadirCoche(Coches coches){
        coches.setColor("Rojo");
        coches.setMarca("Seat");
        coches.setModelo("Ibiza");
        
        return coches;
    }

    public static Coches[] eliminarCoche(Coches[] coches, int borrar, int indice){ 

        for(int i=borrar+1; i<indice; i++){
            coches[borrar-1] = coches[i];
        }
        coches[indice-1] = null;
        return coches;
    }
   
}
