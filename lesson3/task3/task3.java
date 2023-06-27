package lesson3.task3;

import lesson3.task3.model.Book;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        Book book1 = new Book("Бойцовский клуб", "Паланик", 300, 1996, 256);
        Book book2 = new Book("Мастер и Маргарита", "Булгаков", 400, 1940, 488);
        Book book3 = new Book("Мистер Мерседес", "Кинг", 390, 2014, 454);
        Book book4 = new Book("Хорошая поездка", "Уэлш", 279, 2015, 360);

        List<Book> listBook = new ArrayList<>();
        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);
        listBook.add(book4);

        BigInteger bigInteger;
        for (Book book : listBook) {
            bigInteger = BigInteger.valueOf(book.getNumberPages());
            if (bigInteger.isProbablePrime((int) Math.log(book.getNumberPages())) && book.getLastname().contains("а")
                    && book.getYear() >= 2010) {
                System.out.println(book.getName());
            }
        }
    }

}
