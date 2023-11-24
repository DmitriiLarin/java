package project2.task3;

public class Circle {
    static private final double PI = 3.1415926535;
    private double Radius;
    private Point Center;

    public Circle(double radius, Point center) {
        Radius = radius;
        Center = center;
    }

    public double getRadius() {
        return Radius;
    }

    public Point getCenter() {
        return Center;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public void setCenter(Point center) {
        Center = center;
    }

    public double getArea() {
        return PI * Radius * Radius;
    }

    public double getLength() {
        return 2 * PI * Radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.Radius, Radius) == 0;
    }

    @Override
    public String toString() {
        return "Круг {" +
                "Радиус=" + Radius +
                ", Центр окружности=" + Center +
                '}';
    }
}
