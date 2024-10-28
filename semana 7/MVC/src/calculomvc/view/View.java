package calculomvc.view;
import com.coti.tools.Esdia;

import calculomvc.controller.Controller;

public class View {
    /* 
     1. Leer los numeros
     2. calcular la suma (cambiar de estado)
     3. mostrar resultado
     4. salir 
    */

    private Controller c;

    public void showMenu(){
        boolean salir = false;

        while(!salir){
            System.out.println("1. leer los numeros");
            System.out.println("2. calcular la suma (cambiar de estado)");
            System.out.println("3. mostrar resultado");
            System.out.println("4. salir");

            int opcion = Esdia.readInt("Introduzca una opcion: ",1,4);

            switch(opcion){
                case 1: askNumbers(); break;
                case 2: calculate(); break;
                case 3: showResult(); break;
                case 4: salir = true; break;
                default: System.out.println("Numero no valido.");
            }
        }
    }


    private void showResult(){
        int numero1 = c.getNumero1();
        int numero2 = c.getNumero2();
        int resultado = c.getResult();

        System.out.println("Num1 : "+numero1);
        System.out.println("Num2 : "+numero2);
        System.out.println("Resultado : " +resultado);
    }

    private void calculate(){
        c.calculateSuma();
    }

    private void askNumbers(){
        int numero1 = Esdia.readInt("Introduzca el primer numero: ");
        int numero2 = Esdia.readInt("Introduzca el segundo numero: ");

        //tengo que comunicarme con el controller para setar el numero

        c.setNum1(numero1);
        c.setNum2(numero2);
    }


    public void setController(Controller c){
            this.c = c;
    }

    

}
