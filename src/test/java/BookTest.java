import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Terry Pratchett","Small Gods","Fantasy");
    }

    @Test
    public void hasAnAuthor(){
        assertEquals("Terry Pratchett", book.getAuthor());
    }

    @Test
    public void hasATitle(){
        assertEquals("Small Gods", book.getTitle());
    }

    @Test
    public void hasAGenre(){
        assertEquals("Fantasy", book.getGenre());
    }

}
