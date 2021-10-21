package oop.vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Car maserati = new Car("Blue", "Maserati", 240, 35000);
        Motorcycle bmw = new Motorcycle();

        maserati.turnOn();
        maserati.move();
        maserati.stop();
        maserati.stop(20);
        maserati.stop(10, "Loan dr");

        bmw.move();
        bmw.stop();
        bmw.stop(40);
        bmw.stop(70, "Main st");

    }
}
