package Homework13;

public class Homework13 {
    public static void main(String[] args) {

        Author oruell = new Author("Джордж", "Оруэлл");
        Author verber = new Author("Бернар", "Вербер");
        System.out.println(oruell.getFirstname() + " " + oruell.getSurname());
        System.out.println(verber.getFirstname() + " " + verber.getSurname());

        Book book1 = new Book("1984", oruell, 1949);
        Book book2 = new Book("Шестой сон", oruell, 2015);
        System.out.println(book1.getTitle() + " " + book1.getAuthor() + " " + book1.getYear());
        System.out.println(book2.getTitle() + " " + book2.getAuthor() + " " + book2.getYear());


        System.out.println(book1);
        System.out.println(book2);

        System.out.println(oruell);
        System.out.println(verber);

        System.out.println(book1.equals(book2));
        System.out.println(oruell.equals(verber));

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        System.out.println(oruell.hashCode());
        System.out.println(verber.hashCode());
    }
}
