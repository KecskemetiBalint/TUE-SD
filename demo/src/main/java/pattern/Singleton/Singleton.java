package pattern.Singleton;

public class Singleton {
    public final static Singleton instance = new Singleton();
    
    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
