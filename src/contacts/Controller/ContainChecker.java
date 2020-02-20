package contacts.Controller;

import contacts.Model.Contact;

public class Checker {
    public boolean contains(Contact contact, String srch){
        return contact.checkName().contains(srch) || contact.checkSurname().contains(srch) || contact.checkPhone().contains(srch)
                || contact.checkMail().contains(srch) || contact.checkSkype().contains(srch);
    }
    public boolean contains2(Contact contact, String srch, String srch2){
        return contains(contact, srch) || contains(contact, srch2);
    }
}
