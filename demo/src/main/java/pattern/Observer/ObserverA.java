package pattern.Observer;

public class ObserverA implements IObserver {

    @Override
    public void update(ISubject subject) {
        System.out.println("ObserverA: " + subject.getData());
    }
}
