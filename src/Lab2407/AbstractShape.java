package Lab2407;
//Abstract class
abstract class Shape {
    abstract double calculateArea();
}

// Circle subclass
class Circle extends Shape {
    double radius = 5;

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    double length = 9, width = 8.9;

    @Override
    double calculateArea() {
        return length * width;
    }
}

// Main class
public class AbstractShape{
    public static void main(String[] args) {
        // Create Circle object
        Circle c = new Circle();
        System.out.println("Area of Circle: " + c.calculateArea());

        // Create Rectangle object
        Rectangle r = new Rectangle();
        System.out.println("Area of Rectangle: " + r.calculateArea());
    }
}