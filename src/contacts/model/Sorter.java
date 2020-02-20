package contacts.model;

import contacts.view.View;

import java.util.*;

public class Sorter {
    public static View view;
    public Sorter(View view){
        this.view = view;
    }

    public static void sortNames(List<String> nameList) {
        for (Contact contact : Contact.values()){
            nameList.add(contact.checkName());
        }
        Collections.sort(nameList);
        for (String name : nameList){
            for (Contact contact : Contact.values()){
                if (contact.checkName().equals(name)){
                    view.printContactInfo(contact);
                }
            }
        }
        view.drawSpace();
    }

    public static void sortSurnames(List<String> surList) {
        for (Contact contact : Contact.values()){
            surList.add(contact.checkSurname());
        }
        Collections.sort(surList);
        for (String sur : surList){
            for (Contact contact : Contact.values()){
                if (contact.checkSurname().equals(sur)) {
                    view.printContactInfo(contact);
                }
            }
        }
        view.drawSpace();
    }

}
