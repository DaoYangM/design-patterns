public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert quarter, we already sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Its' impossible");
    }

    @Override
    public void turnCrank() {
        System.out.println("Please to call the server to input the more gumball");
    }

    @Override
    public void dispense() {
        System.out.println("OOP");
    }
}
