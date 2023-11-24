package project5.task2;
import java.awt.*;

// Абстрактный класс для фигур
abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Абстрактный метод для отрисовки фигуры
    public abstract void draw(Graphics g);
}
