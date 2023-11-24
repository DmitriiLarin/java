package project12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel[] pnl = new JPanel[20];
        frame.setLayout(new GridLayout(4, 5));
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g); //Очистка панели перед рисованием новых фигур
                    Random random = new Random();
                    int x = random.nextInt(50); // случайная позиция по X
                    int y = random.nextInt(50); // случайная позиция по Y
                    Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)); // случайный цвет

                    // Случайно выбираем, рисовать ли прямоугольник или круг
                    if (random.nextBoolean()) {
                        int width = random.nextInt(50) + 10; // случайная ширина
                        int height = random.nextInt(50) + 10; // случайная высота
                        Rectangle rectangle = new Rectangle(color, x, y, width, height);
                        rectangle.draw(g);
                    } else {
                        int radius = random.nextInt(25) + 5; // случайный радиус
                        Circle circle = new Circle(color, x, y, radius);
                        circle.draw(g);
                    }
                }
            };
            pnl[i].setSize(100, 100);
            frame.add(pnl[i]);
        }
        frame.setVisible(true);
    }
}
