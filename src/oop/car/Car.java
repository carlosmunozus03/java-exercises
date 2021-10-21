package oop.car;

public class Car {
    //Attributes
    private String color;
    private String brand;
    private int speed;
    private int price;

    //true = start
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
    private void start() {
        if (!state) {
            System.out.println("The " + this.brand + " it has turned on");
            state = true;
        } else {
            System.out.println("The " + this.brand + " it's already on");
        }
    }

    void off() {
        if (state) {
            System.out.println(this.brand + " It has been turned off");
            state = false;
        } else {
            System.out.println(this.brand + " it's already off");
        }
    }

    void move() {
        start();
//        System.out.println("The " + this.brand + " can moving at " + this.speed + " km/hr");
        if (state) {
            System.out.println(this.brand + " is moving at " + this.speed + " km/hr");
        } else {
            System.out.println(this.brand + " should to be on for move");
        }
    }

    void stop() {
        if (state) {
            System.out.println(this.brand + " is stopping");
        } else {
            System.out.println(this.brand + " should to be 'start' and in movement for stop");
        }
    }

    //Setter and Getter when the attributes are private (encapsulation)


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
