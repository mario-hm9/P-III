package calculomvc.model;

public class Calculadora {
    private int num1 = 0;
    private int num2 = 0;
    private int resultado = 0;


    //metodo de suma
    public void sumar(){
        this.resultado = num1 + num2;
    }


    //getters y setters
    //para hacerlo con vs code rápido hay que hacer click derecho -> Source Actions, seleccionar la opcion
    //y luego seleccionar las variables deseadas

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

}
    
    

    
