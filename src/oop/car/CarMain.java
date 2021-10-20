package oop.car;

public class CarMain {
    public static void main(String[] args) {
        Car ferrari = new Car();

        ferrari.brand = "Ferrari";
        ferrari.color = "Red";
        ferrari.speed = 5;

        ferrari.start("Ferrari", 0);
        ferrari.stop();
    }
}
