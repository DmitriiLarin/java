package project4_1.task1;

public class Square extends Shape {
    private double a;
    @Override
    public String getType() {
        return "Квадрат";
    }

    @Override
    public double getArea() {
        return a*a;
    }

    @Override
    public double getPerimeter() {
        return 4*a;
    }

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Квадрат" +
                "a=" + a +
                ", площадь=" + getArea() +
                ", периметр=" + getPerimeter() +
                ", тип=" + getType() +
                '}';
    }
}
