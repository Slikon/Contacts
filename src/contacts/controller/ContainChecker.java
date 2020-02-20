package contacts.controller;

import contacts.model.Contact;

public class ContainChecker {
    /**
     * Checks if contact (1st argument) contains substring (2nd argument) inside its data
     * @param contact - contact that is going to be investigated
     * @param srch - substring, that is used to be found in contact's data
     * @return  Method returns true if substring is found, false if now
     */
    public boolean contains(Contact contact, String srch){
        return contact.checkName().contains(srch) || contact.checkSurname().contains(srch)
                || contact.checkPhone().contains(srch)
                || contact.checkMail().contains(srch)
                || contact.checkSkype().contains(srch);
    }

    /**
     * @see ContainChecker#contains(Contact, String) for info.
     * Only difference from {@link ContainChecker#contains(Contact, String)} is the second arg
     * @param contact - contact that is going to be investigated
     * @param srch - 1st substring, that is used to be found in contact's data
     * @param srch2 - 2nd substring, that is used to be found in contact's data
     * @return Method returns true if each substring is found, false if now
     */
    public boolean contains2(Contact contact, String srch, String srch2){
        return contains(contact, srch) && contains(contact, srch2);
    }
}
