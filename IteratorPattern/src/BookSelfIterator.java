import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookSelfIterator implements Iterator<Book> {
    private BookSelf bookSelf;
    private int index;

    public BookSelfIterator(BookSelf bookSelf) {
        this.bookSelf = bookSelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < bookSelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookSelf.getBookAt(index);
        index++;
        return book;
    }
}
