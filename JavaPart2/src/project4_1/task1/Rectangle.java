package project4_1.task1;

public class Rectangle extends Shape {
    private double a;
    private double b;

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }

    public void setRectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Прямоугольник{" +
                "a=" + a +
                ", b=" + b +
                ", площадь=" + getArea() +
                ", периметр=" + getPerimeter() +
                ", тип=" + getType() +
                '}';
    }
}
