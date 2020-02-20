package contacts.model;

public enum Contact {

    SLAVA("Slava", "Kulyk", "0674777231", null, "Slikon"),
    HELEN("Helen", "Gris", "0982315432", "helen.gris@gmail.com", null),
    DENIS("Denis", "Hunter", "0638800555", "hunter1337@mail.ru", "HunterNum1"),
    DARIA("Daria", "Shevchuk", "0672593271", "shevch.d@yahoo.com", "Shevchuk2000" ),
    VARIAN("Varian", "Wrynn", "0962347162", null, "FuryWarrior"),
    ARTHAS("Arthas", "Menetil", "0997775690", "arthas_lich@ukr.net", "FrostMourn99");

    private final String name;
    private final String surname;
    private final String phoneNum;
    private final String email;
    private final String skype;

    //public static final String dataAbsent = "no data";
    private Contact(String name, String surname, String phoneNum, String email, String skype){
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

    public String checkName() { return this.name == null ? "" : this.getName(); }
    public String checkSurname() { return this.name == null ? "" : this.getSurname(); }
    public String checkPhone() { return this.phoneNum == null ? "" : this.getPhoneNum(); }
    public String checkMail() { return this.email == null ? "" : this.getEmail(); }
    public String checkSkype() { return this.skype == null ? "" : this.getSkype(); }

}
