package Homework12;

/*
Почему IDEA не дает кореектно присвоить тип полю aurhor,
хотя класс стаким именем создан?
Изменив тип свойства author на String все начинает работать
*/

public class HomeWork12 {
    public static void main(String[] args) {

        Book book1 = new Book("1984", "Джорд Оруэлл", 1949);
        Book book2 = new Book("Шестой сон", "Бернар Вербер", 2015);
        System.out.println(book1.getTitle() + " " + book1.getAuthor() + " " + book1.getYear());
        System.out.println(book2.getTitle() + " " + book2.getAuthor() + " " + book2.getYear());


        Author fet = new Author("Афанасий", "Фет");
        Author blok = new Author("Александр", "Блок");
        System.out.println(fet.getFirstname() + " " + fet.getSurname());
        System.out.println(blok.getFirstname() + " " + blok.getSurname());

        book2.setYear(2020);
        System.out.println("Переиздание книги Шестой сон в " + book2.getYear());
    }
}