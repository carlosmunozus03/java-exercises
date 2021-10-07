package oop;

public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void printStates() {
        System.out.println("Cadence: " + cadence + " " + "Speed: " + speed + " " + "Gear: " + gear);
    }
}
