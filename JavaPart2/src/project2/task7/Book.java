package project2.task7;

public class Book implements Comparable{
    private String author;
    private String name;
    private int year;

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(year, ((Book)o).getYear());
    }

    @Override
    public String toString() {
        return "Книга {" +
                author + ", name='" + name + '\'' + ", " + year + '}';
    }
}
