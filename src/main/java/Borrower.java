import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower(){
        this.collection= new ArrayList<Book>();
    }

    public int collectionCount() {
        return this.collection.size();
    }

    public void borrowBook(Library library, Book book) {
        Book book1 = library.removeBook(book);
        this.collection.add(book1);
    }
}
