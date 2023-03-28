import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;
    private Library library;
    private Borrower borrower;

    @Before
    public void before() {
        book = new Book("Harry Potter", "J.K. Rowling", "Fantasy");
        library = new Library(2);
        borrower = new Borrower();
        library.addBook(book);

    }

    @Test
    public void howManyBooksInCollection() {
        assertEquals(0, borrower.collectionCount());
    }
    @Test
    public void borrowBookFromLibrary(){
        borrower.borrowBook(library , book);
        assertEquals(0, library.bookCount());
        assertEquals(1, borrower.collectionCount());
    }
}
