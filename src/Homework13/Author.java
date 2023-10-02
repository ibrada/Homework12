package Homework13;
import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstname.length(), author.firstname.length()) && Objects.equals(surname.length(), author.surname.length());
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, surname);
    }
}
