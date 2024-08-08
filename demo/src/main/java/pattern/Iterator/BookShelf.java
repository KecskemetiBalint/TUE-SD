package pattern.Iterator;

import java.util.Iterator;

public class BookShelf implements Iterable<Book>{
    public Shelf shelfSK = new Shelf("Stephen King");
    public Shelf shelfJK = new Shelf("John Scalzi");
    public Shelf shelfPS = new Shelf("Petőfi Sándor");
    public Shelf shelfKS = new Shelf("Kovács Béla");

    //createiterator 
    @Override
    public Iterator<Book> iterator() {
        return new BookshelfIterator(this);
    }
}

