package pattern.Observer;

public class ObserverClient {
    public static void run() {
        ObserverA observerA = new ObserverA();
        ObserverB observerB = new ObserverB();
        Subject subject = new Subject();
        subject.modify(1);
        subject.modify(2);
        subject.addObserver(observerA);
        subject.modify(3);
        subject.addObserver(observerB);
        subject.modify(4);
        subject.removeObserver(observerA);
        subject.modify(5);
    }
}
