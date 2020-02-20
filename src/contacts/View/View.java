package contacts.View;

import contacts.Model.Contact;

public class View {

    public void printMessage(String msg){
        System.out.println(msg);
    }
    public void drawLine(){
        System.out.println("=================================================================================================");
    }
    public void drawSpace(){
        int spaceWidth = 5;
        for (int i = 0; i < spaceWidth; i++){
            System.out.println("*");
        }
    }

    public void printContactInfo(Contact contact){
        System.out.format(TextConstants.formatInfo, contact.checkName(), contact.checkSurname(), contact.checkPhone(), contact.checkMail(), contact.checkSkype());
        System.out.println();
    }

    public void printHeader(){
        drawLine();
        System.out.format(TextConstants.formatInfo, TextConstants.cName, TextConstants.cSurname, TextConstants.cPhone, TextConstants.cMail, TextConstants.cSkype);
        System.out.println();
        drawLine();
    }

    public void printFullList(){
        printHeader();
        for (Contact contact : Contact.values()){
           printContactInfo(contact);
        }
        drawSpace();
    }

}
