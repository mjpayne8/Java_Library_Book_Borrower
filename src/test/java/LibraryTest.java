import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(1);
        book = new Book("Terry Pratchett", "Small Gods", "Fantasy");
        borrower = new Borrower();
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

    @Test
    public void cannotAddBookWhenFull(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canLendBook(){
        library.addBook(book);
        library.loanBook(book, borrower);
        assertEquals(0, library.countBooks());
        assertEquals(1, borrower.countBooks());
    }
}
