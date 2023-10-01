package Homework13;
public class Author {
    private String firstname;
    private String surname;

    public Author(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getSurname() {
        return surname;
    }

    public String toString() {
return "Имя " + this.firstname + " Фамилия " + this.surname;
    }


}
