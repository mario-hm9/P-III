import controller.Controller;
import model.Quiniela;
import view.View;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("QuinielaMVC");

        Quiniela model = new Quiniela();
        View view = new View();

        Controller controller = new Controller(view, model);
        controller.init();
    }
}
