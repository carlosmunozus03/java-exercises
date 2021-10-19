package oop.interfaces;

public class Bicycle implements Wheel, Sit {

    public void move() {
        System.out.println("The bicycle is moving");
    }

    public void stop() {
        System.out.println("The bicycle is stop");
    }

    public void sit() {
        System.out.println("Im sit in the bicycle");
    }
}
