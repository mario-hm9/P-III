public class Coche {

    private String marca;
    private String modelo;
    private String color;

    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String imprimirLista(){
        return "\nMarca: "+marca+ " Modelo: "+modelo+" Color: "+color;
    }

}
