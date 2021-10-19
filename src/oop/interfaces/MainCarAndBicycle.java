package oop.interfaces;

public class MainCarAndBicycle {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.move();
        car.stop();

        bicycle.move();
        bicycle.stop();
        bicycle.sit();
    }
}
