package project2.task3;

public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(5, new Point(1, 1));
        Point point = new Point(2, 2);
        System.out.println(circle.toString());
        circle.setCenter(point);
        circle.setRadius(10);
        System.out.println(circle.toString());
    }
}
