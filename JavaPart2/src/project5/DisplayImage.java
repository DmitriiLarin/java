package project5;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class DisplayImage {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Изображения нет в аргументах командной строки или изображений несколько.");
            return;
        }

        String imagePath = args[0];
        JFrame frame = new JFrame("Изображение");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(634, 452);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); //Очистка панели перед рисованием
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File(imagePath)); //загружается изображение из указанного файла
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                if (image != null) { //Если изображение успешно загружено, оно отображается на панели
                    g.drawImage(image, 0, 0, null);
                }
                else { //В случае возникновения исключения IOException (например, если изображение не может быть загружено), выводится стек трейс и сообщение об ошибке.
                    g.drawString("Не удалось загрузить изображение.", 10, 30);
                }
            }
        };
        frame.add(panel);
        frame.setVisible(true);
    }
}