package factory;

import factory.ingredient.*;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Peppereoni createPeppereoni();
    Clams createClam();
}
