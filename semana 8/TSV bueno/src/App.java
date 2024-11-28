import model.Model;
import view.View;
import controller.Controller;

public class App {
    public static void main(String[] args) throws Exception {
        
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        
        view.setController(controller);
        controller.init();

    }
}
