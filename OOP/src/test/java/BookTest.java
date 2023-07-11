import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void BookTester() {
        Author author = new Author("Paul", "male", "Paul@gmail.com");
        Book book = new Book("Book", author, 2023);

        assertEquals(author.toString(), "Paul male Paul@gmail.com");
        assertEquals(book.toString(), "Book Paul 2023");

        assertEquals(author.getName(), "Paul");
        assertEquals(author.getSex(), "male");
        assertEquals(author.getEmail(), "Paul@gmail.com");

        assertEquals(book.getName(), "Book");
        assertEquals(book.getAuthor(), author);
        assertEquals(book.getYear(), 2023);
    }
}
