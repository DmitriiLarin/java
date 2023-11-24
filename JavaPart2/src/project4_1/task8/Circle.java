package project4_1.task8;

public class Circle extends Shape {
    private static final double PI = 3.1415926535;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
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
                "радиус=" + radius +
                ", площадь=" + getArea() +
                ", периметр=" + getPerimeter() +
                ", цвет=" + getColor() +
                ", заполненный цветом=" + isFilled() +
                '}';
    }
}
