package pattern.Observer;

import java.util.ArrayList;

public class Subject implements ISubject {
    private int number;
    private ArrayList<IObserver> observers = new ArrayList<IObserver>();

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void modify(int number) {
        if(this.number != number){
            this.number = number;
            for (IObserver iObserver : observers) {
                iObserver.update(this);
            }
        }
    }
    @Override
    public int getData() {
       return number;
    }
}
