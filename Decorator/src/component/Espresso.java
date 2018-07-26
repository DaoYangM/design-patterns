package component;

public class Espresso extends Beverage {

    public Espresso() {
        description = "component.Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
