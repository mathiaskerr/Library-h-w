import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book;
    private Library library;
    private Borrower borrower;

    @Before
    public void before(){
         book = new Book ("Harry Potter","J.K. Rowling", "Fantasy" );
        library = new Library(2);
        borrower = new Borrower();
    }

    @Test
    public void howManyBooksInLibrary(){
        assertEquals(0,library.bookCount());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(book);
        assertEquals(1,library.bookCount());
    }
    @Test
    public void RemoveBookToLibrary(){
        library.addBook(book);
        library.removeBook(book);
        assertEquals(0,library.bookCount());
    }


}
