import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookSelf implements Iterable<Book> {
    private List<Book> books;

    public BookSelf(int maxsize) {
        this.books = new ArrayList<>(maxsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public boolean appendBook(Book book) {
        return books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override public Iterator<Book> iterator() {
        return new BookSelfIterator(this);
    }

}
