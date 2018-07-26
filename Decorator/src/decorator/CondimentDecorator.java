package decorator;

import component.Beverage;
import component.CupSize;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();

    public CupSize getSize() {
        return beverage.getSize();
    }

    public double addCupSizePrice() {
        switch (getSize()) {
            case TALL:
                return .10;
            case Grande:
                return .15;
            case VENTI:
                return .20;
        }
        return 0;
    }

    public double totalPrice() {
        return cost() + addCupSizePrice();
    }
}
