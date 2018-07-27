package factory;

import factory.ingredient.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Peppereoni createPeppereoni() {
        return new Peppereoni();
    }

    @Override
    public Clams createClam() {
        return new Clams();
    }
}
