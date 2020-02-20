package contacts.Model;

import contacts.Controller.ContainChecker;
import contacts.View.TextConstants;
import contacts.View.View;

import java.util.ArrayList;

public class Model {

    private View view;

    /**
     * @param view in order to give Model class an ability to call View methods inside of own ones
     */
    public Model(View view){
        this.view = view;
    }

    ContainChecker check = new ContainChecker();

    /**
     * "search" method finds and prints all contacts that have "srch1" parameter in their data
     * @param srch1 is a substring that is going to be found in contact elements
     */
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

    /**
     * @see Model#search(String) for information. This method takes 2 args instead of 1.
     * @param srch1 - 1st searching arg
     * @param srch2 - 2nd searching arg
     */
    public void search(String srch1, String srch2){
        view.printMessage(TextConstants.searchTwo);
        view.printHeader();
        for (Contact contact : Contact.values()){
            if (check.contains2(contact, srch1, srch2))
                view.printContactInfo(contact);
        }
        view.drawSpace();
    }

    /**
     * Method that creates list of contacts, sorted by their names
     * @see Sorter#sortNames(ArrayList) to see the sorting algorythm
     */
    public void sortByName(){
        Sorter sorter = new Sorter(view);
        view.printMessage(TextConstants.sortedNames);
        view.printHeader();
        sorter.sortNames(new ArrayList<String>());
    }

    /**
     * Method that creates list of contacts, sorted by their surnames
     * @see Sorter#sortSurnames(ArrayList) to see the sorting algorythm
     */
    public void sortBySurname(){
        Sorter sorter = new Sorter(view);
        view.printMessage(TextConstants.sortedSurnames);
        view.printHeader();
        sorter.sortSurnames(new ArrayList<String>());

    }



}
