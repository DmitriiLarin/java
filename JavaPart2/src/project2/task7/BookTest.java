package project2.task7;

public class BookTest {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook("Александр Полярный", "Мятная сказка", 2018);
        bookShelf.addBook("Александр Сергеевич Пушкин", "Евгений Онегин", 1833);
        bookShelf.addBook("Фёдор Михайлович Достоевский", "Идиот", 1867);
        System.out.println(bookShelf);
        System.out.println("Книга с самым ранним годом выпуска: " + bookShelf.getEarliest());
        System.out.println("Книга с самым поздним годом выпуска: " + bookShelf.getLatest());
        bookShelf.sortBooks();
        System.out.println("Сортировка...");
        System.out.println(bookShelf);
    }
}
