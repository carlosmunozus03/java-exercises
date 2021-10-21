package oop.shapes;

public class Circle extends Shapes {
    double radius;
    double PI = Math.PI;

    @Override
    public void calculateArea() {
        System.out.println("PI * r2");
    }
}
