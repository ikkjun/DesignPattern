import java.util.Iterator;

public class BookSelf implements Iterable<Book> {
    private Book[] books;
    private int last = 0;

    public BookSelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override public Iterator<Book> iterator() {
        return new BookSelfIterator(this);
    }

}
