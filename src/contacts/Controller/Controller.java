package contacts.Controller;

import contacts.Model.Model;
import contacts.Model.Sorter;
import contacts.View.*;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void execute(){
        view.printMessage(TextConstants.originalList);
        view.printFullList();
        model.search(TextConstants.search1Tool);
        model.search(TextConstants.search1Tool, TextConstants.search2Tool);
        model.sortByName();
        model.sortBySurname();
    }
}
