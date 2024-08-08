package pattern.Singleton;

public class SingletonLazy {
    public static SingletonLazy instance;
    private int counter;

    private SingletonLazy() {
        counter = 5;
    }

    synchronized public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public void printMessage() {
        System.out.println("singleton vagyok" + counter);
    }

    public void increaseCounter() {
        counter++;
    }
}
