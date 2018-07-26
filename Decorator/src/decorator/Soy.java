package decorator;

import component.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        description = "decorator.Soy";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
