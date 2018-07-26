import component.Beverage;
import component.CupSize;
import component.Espresso;
import decorator.CondimentDecorator;
import decorator.Mocha;
import decorator.Soy;
import decorator.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso.size = CupSize.VENTI;

        Beverage beverage2 = new Mocha(espresso);
        beverage2 = new Whip(beverage2);
        beverage2 = new Soy(beverage2);

        System.out.println(beverage2.getDescription() + " $ " + ((CondimentDecorator)beverage2).totalPrice());
    }
}
