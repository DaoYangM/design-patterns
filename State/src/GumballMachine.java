public class GumballMachine {
    private SoldOutState soldOutState;
    private SoldState soldState;
    private NoQuarterState noQuarterState;
    private HasQuarterState hasQuarterState;
    private WinnerState winnerState;

    private int count;
    private State state = soldOutState;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        winnerState = new WinnerState(this);
        this.count = count;

        state = count > 1 ? noQuarterState : soldOutState;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0)
            count--;
    }

    public int getCount() {
        return count;
    }

    public SoldOutState getSoldOutState() {
        return soldOutState;
    }

    public SoldState getSoldState() {
        return soldState;
    }

    public NoQuarterState getNoQuarterState() {
        return noQuarterState;
    }

    public HasQuarterState getHasQuarterState() {
        return hasQuarterState;
    }

    public WinnerState getWinnerState() {
        return winnerState;
    }
}
