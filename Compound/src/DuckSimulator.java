public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate(new CountingDuckFactory());
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new QuackCount(new GooseAdapter(new Goose()));

        Flock flock = new Flock();
        flock.add(mallardDuck);
        flock.add(redheadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(gooseDuck);

        Flock mallardDuck2 = new Flock();
        mallardDuck2.add(new MallardDuck());
        mallardDuck2.add(new MallardDuck());
        mallardDuck2.add(new MallardDuck());

        flock.add(mallardDuck2);

        Quackologist quackologist = new Quackologist();
        flock.registerObserver(quackologist);

        System.out.println("Duck Simulator: With Goose Adapter");

        simulate(flock);

        System.out.println("Quack count " + QuackCount.getCount());
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
