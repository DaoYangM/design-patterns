public class QuackCount implements Quackable {
    private Quackable quackable;

    public QuackCount(Quackable quackable) {
        this.quackable = quackable;
    }

    private static int count = 0;

    @Override
    public void quack() {
        quackable.quack();
        count ++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void registerObserver(Observer observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }
}
