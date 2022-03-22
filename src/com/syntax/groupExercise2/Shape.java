package com.syntax.groupExercise2;
/*
Create an Interface 'Shape' with undefined methods
as calculateArea and calculatePerimiter. Create 2
classes Circle & Square that implements functionality
defined in the Shape Interface. Test your code.
 */
public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}

class Circle implements Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of this circle is "+(Math.PI*(radius*radius)));
    }
    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of this circle is "+(2*Math.PI*radius));
    }
}

class Square implements Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of this square is "+(side*side));
    }
    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of this square is "+(side*4));
    }
}

class ShapeTest{
    public static void main(String[] args) {
        Shape c = new Circle(4.5);
        c.calculatePerimeter();
        c.calculateArea();

        Shape s = new Square(12.2);
        s.calculateArea();
        s.calculatePerimeter();
    }
}