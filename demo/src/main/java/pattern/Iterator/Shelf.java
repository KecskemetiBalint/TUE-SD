package pattern.Iterator;

public class Shelf {
    public Book[] konyvek = new Book[10];

    public Shelf(String polcNev) {
        for (int i = 0; i < 10; i++) {
            konyvek[i] = new Book(polcNev, "Cím" + i);
        }
    }
}
