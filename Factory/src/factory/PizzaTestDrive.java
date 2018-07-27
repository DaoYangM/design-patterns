package factory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore ny = new NYPizzaStore();
        ny.orderPizza("cheese");
    }
}
