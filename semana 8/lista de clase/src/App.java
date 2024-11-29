import model.Model;
import controller.Controller;
import view.View;

public class App {
    public static void main(String[] args) throws Exception {
        
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        view.setController(controller); 

        controller.init();

    }
}
