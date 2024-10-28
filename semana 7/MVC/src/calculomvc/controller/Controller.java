package calculomvc.controller;

import calculomvc.model.Calculadora;
import calculomvc.view.View;

public class Controller {

    private View v;
    private Calculadora m; //m de modelo

    //para crear este controller necesito una instancia
    //de view y otra de Model (calculadora)


    public void setNum1(int numero1){
        m.setNum1(numero1);
    }

    public void setNum2(int numero2){
        m.setNum2(numero2);
    }

    public void calculateSuma(){
        m.sumar();
    }

    public int getResult(){
        return m.getResultado();
    }

    public int getNumero1(){
        return m.getNum1();
    }

    public int getNumero2(){
        return m.getNum2();
    }

    public void run(){
        v.showMenu();
    }

    public Controller(View v, Calculadora m) {
        this.v = v;
        this.m = m;
    }

    
}
