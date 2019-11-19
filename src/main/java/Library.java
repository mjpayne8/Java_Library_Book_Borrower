import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.countBooks()<capacity) {
            books.add(book);
        }
    }

    public void loanBook(Book book, Borrower borrower) {
        if (this.books.contains(book)){
            this.books.remove(book);
            borrower.addBook(book);
        }
    }
}
