package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape circle = shapeFactory.getShape("circle");
        if (circle != null) circle.draw();

        // Create a Rectangle
        Shape rectangle = shapeFactory.getShape("rectangle");
        if (rectangle != null) rectangle.draw();

        // Create a Square
        Shape square = shapeFactory.getShape("square");
        if (square != null) square.draw();
    }
}
