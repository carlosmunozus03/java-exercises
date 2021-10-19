package oop.add;

public class Add {
    private final int first;
    private final int second;
    private int result;

    public Add(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public void operation() {
        result = first + second;
    }

    public void print() {
        operation();
        System.out.println("The result is: " + result);
    }
}
