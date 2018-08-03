public class Greeting {

    private int count = 0;

    private class Student extends Person {

        public Student(String name, int age) {
            super(name, age);
        }

        @Override
        public void action() {
            System.out.println("I'am a student, my work is study");
        }
    }

    private class Teacher extends Person {

        public void increment() {
            Greeting.this.count ++;
        }

        public Teacher(String name, int age) {
            super(name, age);
        }

        @Override
        public void action() {
            System.out.println("I'm a teacher");
        }
    }

    public Person getDoctor() {
        return new Person("Chuan", 30) {
            @Override
            public void action() {
                System.out.println("I'm a doctor");
            }
        };
    }

    static class Do {
        static void go(Person person) {
            person.introduce();
        }
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        Greeting.Teacher teacher = greeting.new Teacher("Wang", 50);
        Do.go(greeting.new Student("Ye", 21));
        Do.go(teacher);
        Do.go(greeting.getDoctor());

        System.out.println(greeting.count);
        teacher.increment();
        teacher.increment();
        teacher.increment();
        System.out.println(greeting.count);
    }
}
