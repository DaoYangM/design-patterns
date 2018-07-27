package simpleFactory;

public class SimplePizzaFactory {

    Pizza createPizza(String type) {
        switch (type) {
            case "NY":
                return new NYStyleCheesePizza();
            case "Chicago":
                return new ChicagoStyleCheesePizza();
        }
        return new NYStyleCheesePizza();
    }
}
