package oop.family;

public class FamilyMain {
    public static void main(String[] args) {
        Dad dad = new Dad();
        Son son = new Son();
        Daughter daughter = new Daughter();

        dad.walk();
        son.walk();
        daughter.sayHello();

    }
}
