package project4_1.task1;

import project2.task3.Point;

public class Circle extends Shape{
    private static final double PI = 3.1415926535;
    private double radius;
    @Override
    public String getType() {
        return "Круг";
    }
    @Override
    public double getArea() {
        return PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Круг{" +
                "radius=" + radius +
                ", площадь=" + getArea() +
                ", периметр=" + getPerimeter() +
                ", тип=" + getType() +
                '}';
    }
}
