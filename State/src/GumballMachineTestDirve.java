public class GumballMachineTestDirve {
    public static void main(String[] args) throws InterruptedException {
        GumballMachine gumballMachine = new GumballMachine(10);

        for (int i = 0; i < 8; i++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();

            Thread.sleep(1000);
        }
    }
}
