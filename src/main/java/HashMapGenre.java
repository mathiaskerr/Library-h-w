import java.util.HashMap;

public class HashMapGenre {

//static Library library = new Library (50);





    public static void main(String[] args){
        Library library = new Library (50);
        Book book1 = new Book("Harry Potter", "J.K. Rowling", "Fantasy");
        Book book2 = new Book("Harry Potter 2", "J.K. Rowling", "Fantasy");
        Book book3 = new Book("Crime", "crime guy", "crime");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        HashMap <String, Integer> genres = new HashMap<>();

        for (Book book : library.getBooks()){
            if (!genres.containsKey(book.getGenre())) {
            genres.put(book.getGenre(), 1);
            } else {genres.put(book.getGenre(), genres.get(book.getGenre()) + 1);}
        }

        System.out.println(genres);
    }
}
