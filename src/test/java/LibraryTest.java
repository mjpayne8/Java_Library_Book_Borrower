import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Terry Pratchett", "Small Gods", "Fantasy");
    }

    @Test
    public void startsWithNoBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddABook(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }
}
