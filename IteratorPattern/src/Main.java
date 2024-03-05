import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookSelf bookself = new BookSelf(3);
        bookself.appendBook(new Book("Around the World in 80 Days"));
        bookself.appendBook(new Book("Bible"));
        bookself.appendBook(new Book("Cinderella"));
        bookself.appendBook(new Book("Daddy-Long-Legs"));
        bookself.appendBook(new Book("East of Eden"));
        bookself.appendBook(new Book("Frankenstein"));
        bookself.appendBook(new Book("Gulliver's Travels"));
        bookself.appendBook(new Book("Hamlet"));

        // 명시적으로 Iterator을 사용하는 방법
        Iterator<Book> it = bookself.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문을 사용하는 방법
        for(Book book: bookself) {
            System.out.println(book.getName());
        }
        System.out.println();

    }
}
