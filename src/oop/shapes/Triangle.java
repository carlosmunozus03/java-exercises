package oop.shapes;

public class Triangle extends Shapes {
    double height;
    double base;

    @Override
    public void calculateArea() {
        System.out.println("Height * Base / 2");
    }
}
