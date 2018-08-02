public class WinnerState implements State {
    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("To become winner before you must insert quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("It's impossible");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can't turn crank twice");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
        gumballMachine.releaseBall();

        if (gumballMachine.getCount() > 1) {
            gumballMachine.releaseBall();
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
