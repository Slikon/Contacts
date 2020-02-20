package contacts;

import contacts.controller.Controller;
import contacts.model.Model;
import contacts.view.View;

/**
 * Main class is responsible for launching MVC model through Controller.
 * Instances of MVC are created in main
 * @author <strong>Viacheslav Kulyk</strong>
 * @version 1.0.7
 * @since 1.0.0
 * @
 */

public class Main {
    /**
     * main method - starting poing of program's workflow
     * @param args
     */
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model(view);
        Controller controller = new Controller(model, view);
        controller.execute();
    }
}
