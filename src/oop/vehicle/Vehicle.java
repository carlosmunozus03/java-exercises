package oop.vehicle;

public class Vehicle {

    //attributes
    String color;
    String model;
    int price;
    int speed;
    int wheels;

    //turnOn = true
    //turnOff = false
    boolean status = false;

    //Methods
    void turnOn() {
        if (!status) {
            System.out.println("The " + this.model + " it has turned on");
            status = true;
        } else {
            System.out.println("The " + this.model + " it's already on");
        }
    }

    void turnOff() {
        if (status) {
            System.out.println(this.model + " It has been turned off");
            status = false;
        } else {
            System.out.println(this.model + " it's already off");
        }
    }

    void move() {
//        System.out.println("The " + this.brand + " can moving at " + this.speed + " km/hr");
        if (status) {
            System.out.println(this.model + " is moving at " + this.speed + " km/hr");
        } else {
            System.out.println(this.model + " should to be turn on for move");
        }
    }

    void stop() {
        System.out.println("The vehicle is stopping");
    }

    // overcharge methods

    void stop(int speed) {
        System.out.println("The " + this.model + " has reduced its speed from " + speed + " to 0 km");
    }

    void stop(int speed, String street) {
        System.out.println("The " + this.model + " has reduced its speed from " + speed + " to 0 km in the street " + street);
    }
}
