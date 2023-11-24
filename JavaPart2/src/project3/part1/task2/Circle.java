package project3.part1.task2;

public class Circle implements Comparable<Circle>{
    static private final double PI = 3.1415926535;
    private double radius;
    private Point center;

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getLength() {
        return 2 * PI * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public String toString() {
        return "Круг {" +
                "Радиус=" + radius +
                ", Центр окружности=" + center +
                '}';
    }

    @Override
    public int compareTo(Circle circle) {
        return Double.compare(circle.radius, radius);
    }
}
