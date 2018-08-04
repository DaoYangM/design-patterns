import java.util.ArrayList;
import java.util.List;

public class Obserable implements QuackObservable {
    private List<Observer> observers = new ArrayList<>();
    private Quackable quackable;

    public Obserable(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(quackable);
        }
    }
}
