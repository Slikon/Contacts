package contacts.Model;

public enum Contacts {
    VIACHESLAV("0674777231", "slava.kulik09");

    private final String name;
    private final String surname;
    private final String phoneNum;
    private final String email;
    private final String skype;

    private final 
    private Contacts(String name, String surname, String phoneNum, String email, String skype){
        this.name = name;
        this.surname = surname;
        this.phoneNum = phoneNum;
        this.email = email;
        this.skype = skype;
    }

    public String getName() { return name; }
    public String getSurname() {
        return surname;
    }
    public String getPhoneNum() { return phoneNum; }
    public String getEmail() { return email; }
    public String getSkype() {
        return skype;
    }
}
