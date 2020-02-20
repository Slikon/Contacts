package contacts;

import contacts.Controller.Controller;
import contacts.Model.Model;
import contacts.View.View;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        Model model = new Model(view);
        Controller controller = new Controller(model, view);
        controller.execute();
    }
}
