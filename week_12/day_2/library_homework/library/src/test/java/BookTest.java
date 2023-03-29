import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Legion", "Dan Abnett", "Sci-Fi");
    }

    @Test
    public void bookHasName(){
        assertEquals("Legion", book.bookName());
    }
    @Test
    public void bookHasAuthor(){
        assertEquals("Dan Abnett", book.bookAuthor());
    }
    @Test
    public void bookHasGenre(){
        assertEquals("Sci-Fi", book.bookGenre());
    }
}
