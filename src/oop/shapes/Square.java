package oop.shapes;

public class Square extends Shapes {
    double side1;
    double side2;

    @Override
    public void calculateArea() {
        System.out.println("Side1 * side2");
    }
}
