package Homework13;
public class Homework13 {
    public static void main(String[] args) {

        Book book1 = new Book("1984", "Джорд Оруэлл", 1949);
        Book book2 = new Book("Шестой сон", "Бернар Вербер", 2015);

        Author oruell = new Author("Джордж", "Оруэлл");
        Author verber = new Author("Бернар", "Вербер");

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(oruell);
        System.out.println(verber);

        System.out.println(book1.equals(book2));
        System.out.println(oruell.equals(verber));

        book1.setYear(2020);
        book2.setYear(2020);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        System.out.println(oruell.hashCode());
        System.out.println(verber.hashCode());
    }
}
