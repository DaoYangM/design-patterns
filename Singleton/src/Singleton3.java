public class Singleton3 {
    private static Singleton3 uniqueInstance;

    private Singleton3() {}

    public synchronized static Singleton3 getInstance() {
        return uniqueInstance == null? uniqueInstance = new Singleton3(): uniqueInstance;
    }
}
