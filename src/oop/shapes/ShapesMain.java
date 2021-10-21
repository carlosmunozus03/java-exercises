package oop.shapes;

public class ShapesMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Square square = new Square();

        triangle.calculateArea();
        circle.calculateArea();
        square.calculateArea();
    }
}
