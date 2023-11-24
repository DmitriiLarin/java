package project4_1.task3;

public class Person {
    public static void main(String[] args) {
        Person person1 = new Person("Таня", 19);
        Person person2 = new Person();
        person1.move();
        person2.talk();
    }
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        fullName = "No name";
        age = 0;
    }

    public void move() {
        System.out.println(fullName + " идёт");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }
}
