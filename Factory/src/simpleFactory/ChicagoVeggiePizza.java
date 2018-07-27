package simpleFactory;

public class ChicagoVeggiePizza extends Pizza {

    public ChicagoVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Veggie");
    }
}
