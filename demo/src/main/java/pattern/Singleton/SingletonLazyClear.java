package pattern.Singleton;

public class SingletonLazyClear {
    public static SingletonLazyClear theOneInstance = null;

    private SingletonLazyClear() {
    }

    public static SingletonLazyClear getInstance() {
        if (theOneInstance == null) {
            theOneInstance = new SingletonLazyClear();
        }
        return theOneInstance;
    }
}
