package oop.vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Car maserati = new Car("Blue", "Maserati", 240, 35000);
        Motorcycle bwb = new Motorcycle();

        maserati.turnOn();
        bwb.move();
    }
}
