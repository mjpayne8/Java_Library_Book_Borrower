import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    public Borrower borrower;
    public Book book;
    public Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("Terry Pratchett","Small Gods","Fantasy");
        library = new Library(5);
    }

    @Test
    public void startsWithNoBooks(){
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void canAddBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.countBooks());
    }

    @Test
    public void canReturnBook(){
        borrower.addBook(book);
        borrower.returnBook(book, library);
        assertEquals(0, borrower.countBooks());
        assertEquals(1, library.countBooks());
    }

}
