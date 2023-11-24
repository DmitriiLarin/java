package project2.task6;

import project2.task3.Circle;
import project2.task3.Point;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5, new Point(1, 1));
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Длина круга: " + circle.getLength());
        System.out.println("Радиус круга: " + circle.getRadius());
        circle.setRadius(1);
        System.out.println(circle.toString());
    }
}
