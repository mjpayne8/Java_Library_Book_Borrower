import org.junit.Before;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Terry Pratchett","Small Gods","Fantasy");
    }

}
