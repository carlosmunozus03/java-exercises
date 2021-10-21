package oop.family;

public class Daughter implements Mom {


    //Should have the same methods from the interface
    public void sayHello() {
        System.out.println("Hello, I'm a daughter");
    }

    public void sayGoodbye() {
        System.out.println("Bye bye");
    }

    public int sum(int x, int y) {
        int result;
        result = x + y;
        return result;
    }
}
