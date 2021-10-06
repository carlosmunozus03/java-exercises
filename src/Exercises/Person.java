package Exercises;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = this.name;
    }

    public void sayHello() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Person person = new Person("Carlos");
        person.getName();
        person.setName("Andres");
        person.sayHello();
    }
}
