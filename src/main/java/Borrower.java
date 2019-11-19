import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        collection = new ArrayList<Book>();
    }

    public int countBooks() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }

    public void returnBook(Book book, Library library) {
        if (this.collection.contains(book)){
            this.collection.remove(book);
            library.addBook(book);
        }
    }
}
