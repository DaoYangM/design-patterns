public class RubberDuck implements Quackable {
    private Obserable obserable;

    public RubberDuck() {
        obserable = new Obserable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        obserable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        obserable.notifyObservers();
    }
}
