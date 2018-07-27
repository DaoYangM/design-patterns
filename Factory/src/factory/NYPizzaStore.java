package factory;

import factory.ingredient.CheesePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new CheesePizza(new NYPizzaIngredientFactory());
            case "clam":
                return new ClamPizza(new NYPizzaIngredientFactory());
        }
        return null;
    }
}
