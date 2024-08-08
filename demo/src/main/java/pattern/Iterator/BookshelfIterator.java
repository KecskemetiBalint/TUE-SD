package pattern.Iterator;

import java.util.Iterator;

//concrete itartor
public class BookshelfIterator implements Iterator<Book>{
    BookShelf bookShelf;
    int position;

    public BookshelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        position = -1;
    }

    @Override
    public boolean hasNext() {
        if( position < 39) {
            return true;
        }
        return false;
    }

    @Override
    public Book next() {
        position++;
        if(position < 10){
            return bookShelf.shelfJK.konyvek[position];
        }        
        if(position < 20) {
            return bookShelf.shelfSK.konyvek[position - 10];
        }                    
        if(position < 30) {
            return bookShelf.shelfPS.konyvek[position - 20];
        }            
        return bookShelf.shelfKS.konyvek[position - 30];
    }    
}
