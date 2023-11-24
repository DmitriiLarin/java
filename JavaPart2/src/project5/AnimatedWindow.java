package project5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimatedWindow extends JFrame {
    private ImageIcon[] frames;
    private JLabel animationLabel;
    private int currentFrameIndex;

    public AnimatedWindow() {
        frames = new ImageIcon[6];
        for (int i = 0; i < frames.length; i++) {
            frames[i] = new ImageIcon("C:/Users/tanap/OneDrive/Изображения/animation" + i + ".jpg");
        }

        setTitle("Animated Window");
        setSize(770, 580);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        animationLabel = new JLabel();
        add(animationLabel, BorderLayout.CENTER);

        currentFrameIndex = 0; //Индекс текущего кадра, позволяет начать анимацию с первого кадра

        int delay = 50; //задержка обновления кадров = 50 миллисекунд
        Timer timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateAnimation();
            } //при срабатывания таймера вызывается метод updateAnimation
        });
        timer.start();
    }

    private void updateAnimation() { //Метод обновления картинок
        animationLabel.setIcon(frames[currentFrameIndex]); //устанавливает текущим кадром следующую картинку из массива картинок
        currentFrameIndex = (currentFrameIndex + 1) % frames.length; //индекс увеличивается на единицу, а потом сбрасывается (для цикла)
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AnimatedWindow animatedWindow = new AnimatedWindow();
                animatedWindow.setVisible(true);
            }
        });
    }
}
