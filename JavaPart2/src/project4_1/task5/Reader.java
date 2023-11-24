package project4_1.task5;

public class Reader {
    public static void main(String[] args) {
        Reader reader = new Reader("Иванов И.И.", "123456", "Журналистика", "12.10.2000", "89067800908");
        reader.takeBook(5);
        reader.takeBook("Евгений Онегин", "Преступление и наказание");
        reader.returnBook(new Book("Евгений Онегин", "Александр Пушкин"));
    }
    private String fullName;
    private String readerNumber;
    private String faculty;
    private String birthday;
    private String number;

    public Reader(String fullName, String readerNumber, String faculty, String birthday, String number) {
        this.fullName = fullName;
        this.readerNumber = readerNumber;
        this.faculty = faculty;
        this.birthday = birthday;
        this.number = number;
    }

    public void takeBook(int countBooks) {
        System.out.println(fullName + " взял " + countBooks + " книги.");
    }

    public void returnBook(int countBooks) {
        System.out.println(fullName + " вернул " + countBooks + " книги.");
    }

    public void takeBook(String...books) {
        System.out.print(fullName + " взял книги: ");
        for (int i=0; i<(books.length - 1); i++) {
            System.out.print(books[i] + ", ");
        }
        System.out.println(books[books.length - 1] + ".");
    }

    public void returnBook(String...books) {
        System.out.print(fullName + " вернул книги: ");
        for (int i=0; i<(books.length - 1); i++) {
            System.out.print(books[i] + ", ");
        }
        System.out.println(books[books.length - 1] + ".");
    }

    public void takeBook(Book...books) {
        System.out.print(fullName + " взял книги: ");
        for (int i=0; i<(books.length - 1); i++) {
            System.out.print(books[i].getName() + ", ");
        }
        System.out.println(books[books.length - 1].getName() + ".");
    }

    public void returnBook(Book...books) {
        System.out.print(fullName + " вернул книги: ");
        for (int i=0; i<(books.length - 1); i++) {
            System.out.print(books[i].getName() + ", ");
        }
        System.out.println(books[books.length - 1].getName() + ".");
    }
}
