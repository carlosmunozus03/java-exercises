package oop.car;

public class CarMain {
    public static void main(String[] args) {

        Car ferrari = new Car("Red", "Ferrari", 300, 30000);
        Car lamborghini = new Car("Yellow", "Lamborghini", 250, 20000);

//        ferrari.brand = "Ferrari";
//        ferrari.color = "Red";
//        ferrari.speed = 5;

        ferrari.start();
        ferrari.off();

//        System.out.println("Price of car is: USD$ " + ferrari.price);
//        System.out.println("Max speed is: " + ferrari.speed + " km/hr");

        //Using this in method
        ferrari.move();
        lamborghini.move();

    }
}
