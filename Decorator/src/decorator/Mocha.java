package decorator;

import component.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        description = "decorator.Mocha";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
