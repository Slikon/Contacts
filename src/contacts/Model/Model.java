package contacts.Model;

import contacts.Controller.ContainChecker;
import contacts.View.TextConstants;
import contacts.View.View;

import java.util.ArrayList;

public class Model {

    private View view;

    public Model(View view){
        this.view = view;
    }

    ContainChecker check = new ContainChecker();

    public void search(String srch1){
        view.printMessage(TextConstants.searchOne);
        view.printHeader();
        for(Contact contact : Contact.values()){
            if (check.contains(contact, srch1)){
                view.printContactInfo(contact);
            }
        }
        view.drawSpace();
    }
    public void search(String srch1, String srch2){
        view.printMessage(TextConstants.searchTwo);
        view.printHeader();
        for (Contact contact : Contact.values()){
            if (check.contains2(contact, srch1, srch2))
                view.printContactInfo(contact);
        }
        view.drawSpace();
    }

    public void sortByName(){
        Sorter sorter = new Sorter(view);
        view.printMessage(TextConstants.sortedNames);
        view.printHeader();
        sorter.sortNames(new ArrayList<String>());
    }

    public void sortBySurname(){
        Sorter sorter = new Sorter(view);
        view.printMessage(TextConstants.sortedSurnames);
        view.printHeader();
        sorter.sortSurnames(new ArrayList<String>());

    }



}
