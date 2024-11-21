import controller.Controller;
import model.Quiniela;
import view.View;

public class App {
    public static void main(String[] args) throws Exception {

        Quiniela model = new Quiniela();
        View view = new View();
        Controller controller = new Controller(model, view);

        view.setController(controller);
        controller.init();
    }
}