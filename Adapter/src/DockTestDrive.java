public class DockTestDrive {

    public static void main(String[] args) {
        Turkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        Duck duck = turkeyAdapter;

        duck.fly();
        duck.quack();
    }
}
