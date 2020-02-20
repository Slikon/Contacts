package contacts.View;

import contacts.Model.Model;

public interface TextConstants {
    public String originalList = "Here is an original list of contacts: ";
    public String sortedNames = "List of contacts, sorted by name";
    public String sortedSurnames = "List of contacts, sorted by surname";

    public String searchOne = "Result of search by one parameter : \"" + TextConstants.search1Tool + "\"";
    public String searchTwo = "Result of search by two parameters : \"" + TextConstants.search1Tool + "\" and \"" + TextConstants.search2Tool + "\"";
    public static String search1Tool = "D";
    public static String search2Tool = "en";

    public String cName = "Name";
    public String cSurname = "Surname";
    public String cPhone = "Phone Number";
    public String cMail = "Email";
    public String cSkype = "Skype";

    /* ************************************************************** */

    public String c1Format = "%-15s";
    public String c2Format = "%-15s";
    public String c3Format = "%-20s";
    public String c4Format = "%-30s";
    public String c5Format = "%-20s";
    public String formatInfo = c1Format + " " + c2Format + " " + c3Format + " " + c4Format + " " + c5Format;


}
