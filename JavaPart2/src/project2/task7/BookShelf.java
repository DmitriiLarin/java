package project2.task7;

import java.util.ArrayList;

public class BookShelf {
    private ArrayList<Book> books = new ArrayList<>();
    private int countBook = 0;

    public void addBook(String author, String name, int year) {
        books.add(new Book(author, name, year));
        countBook++;
    }

    public Book getEarliest() {
       Book book = null;
       int min = Integer.MAX_VALUE;
       for (int i=0; i < books.size(); i++) {
           int year = books.get(i).getYear();
           if (year < min) {
               min = year;
               book = books.get(i);
           }
       }
       return book;
    }

    public Book getLatest() {
        Book book = null;
        int max = Integer.MIN_VALUE;
        for (int i=0; i < books.size(); i++) {
            int year = books.get(i).getYear();
            if (year > max) {
                max = year;
                book = books.get(i);
            }
        }
        return book;
    }

    public void sortBooks() {
        books.sort(Book::compareTo);
    }

    @Override
    public String toString() {
        return "Список книг: " + books +
                ", количество книг = " + countBook;
    }
}
