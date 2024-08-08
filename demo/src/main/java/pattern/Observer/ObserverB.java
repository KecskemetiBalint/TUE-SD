package pattern.Observer;

public class ObserverB implements IObserver {

    @Override
    public void update(ISubject subject) {
        System.out.println("ObserverB: " + subject.getData());
    }
}