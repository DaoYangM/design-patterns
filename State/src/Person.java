public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("My name is " + name + " I'm " + age + " years old");
    }

    public abstract void action();

    public void introduce() {
        say();
        action();
    }
}
