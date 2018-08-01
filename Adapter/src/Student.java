public class Student extends People {
    Bike bike = new Bike();

    public Student() {
        System.out.println("Student");
    }

    public static void main(String[] args) {
        People people = new Student();
    }
}

class Bike {
    public Bike() {
        System.out.println("Bike");
    }
}
