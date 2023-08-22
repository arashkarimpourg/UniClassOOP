class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Jane", 25);

        System.out.println("Name: " + person1.name + ", Age: " + person1.age);
        System.out.println("Name: " + person2.name + ", Age: " + person2.age);
    }
}
