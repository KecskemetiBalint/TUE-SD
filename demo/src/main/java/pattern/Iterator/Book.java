package pattern.Iterator;

public class Book {
    public String szerzo;
    public String cim;

    public Book(String szerzo, String cim){
        this.szerzo = szerzo;
        this.cim = cim;
    }    

    @Override
    public String toString(){
        return String.format("A könyv adatai: szerző %s : cím %s", this.szerzo, this.cim);
    }
}
