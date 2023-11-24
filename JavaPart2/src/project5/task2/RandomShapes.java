package project5.task2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); //Очистка панели перед рисованием новых фигур
                Random random = new Random();
                for (int i = 0; i < 20; i++) {
                    int x = random.nextInt(700); // случайная позиция по X
                    int y = random.nextInt(500); // случайная позиция по Y
                    Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)); // случайный цвет

                    // Случайно выбираем, рисовать ли прямоугольник или круг
                    if (random.nextBoolean()) {
                        int width = random.nextInt(100) + 50; // случайная ширина
                        int height = random.nextInt(100) + 50; // случайная высота
                        Rectangle rectangle = new Rectangle(color, x, y, width, height);
                        rectangle.draw(g);
                    }
                    else {
                        int radius = random.nextInt(50) + 25; // случайный радиус
                        Circle circle = new Circle(color, x, y, radius);
                        circle.draw(g);
                    }
                }
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}