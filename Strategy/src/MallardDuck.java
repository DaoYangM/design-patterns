import behavior.fly.FlyBehavior;
import behavior.fly.FlyWithWings;
import behavior.quack.Quack;
import behavior.quack.QuackBehavior;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this( new FlyWithWings(), new Quack());
    }

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
