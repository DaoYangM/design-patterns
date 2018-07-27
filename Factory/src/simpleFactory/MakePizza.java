package simpleFactory;

public class MakePizza {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        pizzaStore.orderPizza("NY");
    }
}
