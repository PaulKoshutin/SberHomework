public class Book {
    private String name;
    private Author author;
    private int year;

    Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return name + " " + author.getName() + " " + year;
    }
}
