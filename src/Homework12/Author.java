package Homework12;

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

    @Override
    public String toString() {
        return "Имя " + firstname + " Фамилия " + surname;
    }
}
