package pattern.Iterator;

public class IteratorClient {
    public static void run() {
        BookShelf bs = new BookShelf();        
        for (Book konyv : bs) {
            System.out.println(konyv); 
        }

        //
        System.out.println("OLD WAY");            
        for (Book konyv : bs.shelfJK.konyvek) {
            System.out.println(konyv);            
        }
        for (Book konyv : bs.shelfPS.konyvek) {
            System.out.println(konyv);            
        }
        for (Book konyv : bs.shelfSK.konyvek) {
            System.out.println(konyv);            
        }        

    }
}
