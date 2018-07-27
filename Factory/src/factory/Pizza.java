package factory;

import factory.ingredient.*;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Peppereoni peppereoni;
    protected Veggies[] veggies;
    protected Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minute at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slice");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
