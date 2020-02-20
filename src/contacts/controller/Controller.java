package contacts.controller;

import contacts.model.Model;
import contacts.view.*;

public class Controller {
    private Model model;
    private View view;

    /**
     * Controller constructor takes instances of Model and View as parameters to have an access to these classes methods and fields
     * @param model private model object
     * @param view  private view object
     */
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    /**
     * Main workflow of the program. Starts other methods from Model and View classes
     */
    public void execute(){
        view.printMessage(TextConstants.originalList);
        view.printFullList();
        model.search(TextConstants.search1Tool);
        model.search(TextConstants.search1Tool, TextConstants.search2Tool);
        model.sortByName();
        model.sortBySurname();
    }
}
