public class MallardDuck implements Quackable {
    private Obserable obserable;

    public MallardDuck() {
        obserable = new Obserable(this);
    }
    @Override
    public void quack() {
        System.out.println("Quack");
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
