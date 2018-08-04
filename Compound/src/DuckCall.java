public class DuckCall implements Quackable {

    private Obserable obserable;

    public DuckCall() {
        obserable = new Obserable(this);
    }    @Override
    public void quack() {
        System.out.println("Kwak");
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
