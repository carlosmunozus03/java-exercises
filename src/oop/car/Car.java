package oop.car;

public class Car {

    String color;
    String brand;
    int speed;

    void start(String brand, int speed) {
        System.out.println("The car " + brand + " is start the engine at " + speed + " km/hr");
    }

    void off() {
        System.out.println("The car is turn off the engine");
    }

    void move() {
        System.out.println("The car is moving");
    }

    void stop() {
        System.out.println("The car is stopping");
    }
}
