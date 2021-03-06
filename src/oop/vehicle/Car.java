package oop.vehicle;

public class Car extends Vehicle {

    //constructor
    public Car(String color, String model, int speed, int price) {
        this.color = color;
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

//add the annotation for to be specific
    @Override
    void stop() {
        System.out.println("The " + this.model + " is stopping");
    }
}
