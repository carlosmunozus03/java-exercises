package oop.car;

public class Car {
    //Attributes
    String color;
    String brand;
    int speed;
    int price;

    // true = start
    //false = off
    boolean state = false;

    //Constructor

    public Car(String color, String brand, int speed, int price) {
        this.color = color;
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    //Methods
    void start() {
        if (state) {
            System.out.println("The " + this.brand + " is off");
            state = true;
        } else {
            System.out.println("The " + this.brand + " is on");
        }
    }

    void off() {
        if (!state) {
            System.out.println(this.brand + " is on");
            state = false;
        } else {
            System.out.println(this.brand + " is off");
        }
    }

    void move() {
//        System.out.println("The " + this.brand + " can moving at " + this.speed + " km/hr");
        if (!state){
            System.out.println(this.brand + " is moving");
        } else{
            System.out.println(this.brand+ " should to be on for move");
        }
    }

    void stop() {
        System.out.println("The " + this.brand + " is stopping until 0 km/hr");
    }
}
