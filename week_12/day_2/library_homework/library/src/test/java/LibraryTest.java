import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(10);
        book = new Book("Legion", "Dan Abnett", "Sci-Fi");
    }

    @Test
    public void countStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }
    @Test
    public void checkCapacity(){
        library = new Library(1);
        library.addBook(book);
        assertEquals(true, library.capacityCheck());
    }
}
