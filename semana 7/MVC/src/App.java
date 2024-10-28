
//Plasmar en MVC la suma de dos numeros enteros

import calculomvc.controller.Controller;
import calculomvc.model.Calculadora;
import calculomvc.view.View;

public class App {
    public static void main(String[] args) throws Exception {
        //Constructor de las instancias del MVC
        //Inyectar el contorlador en la vista y la vista
        //en el controlador

        Calculadora model = new Calculadora();
        View view = new View();
        Controller controller = new Controller(view, model);

        //Inyectar el controlador en la vista
        view.setController(controller);

        //iniciar el codigo desde el controller
        controller.run();

        //el controller.run() llamará la vista v.showMenu()

    }
}
