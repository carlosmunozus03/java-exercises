package oop.interfaces;

public class Car implements Wheel {

    public void move() {
        System.out.println("The car is moving");
    }

    public void stop() {
        System.out.println("The car is stop");
    }
}
