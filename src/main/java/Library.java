import java.util.ArrayList;

public class Library {
    private Integer capacity;
    private ArrayList<Book> books;

    public Library(Integer capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public int bookCount() {
       return this.books.size();
    }


    public void addBook(Book book) {
        if(getCapacity() - bookCount() > 0){
        this.books.add(book);}
    }
    public Book removeBook(Book book) {
        this.books.remove(book);
        return book;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
