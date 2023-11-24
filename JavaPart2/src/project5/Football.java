package project5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football {
    public int real = 0;
    public int milan = 0;
    public Football() {
        frame();
    }

    public void frame() {

        JFrame frame = new JFrame("Футбольный матч");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 200);

        JPanel panel= new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(250, 200));

        JButton buttonMilan = new JButton("AC Milan");
        buttonMilan.setBackground(Color.CYAN);
        panel.add(buttonMilan);

        JButton buttonReal = new JButton("Real Madrid");
        buttonReal.setBackground(Color.GREEN);
        panel.add(buttonReal);

        JLabel score = new JLabel("Result: " + milan + " X " + real, JLabel.CENTER);
        panel.add(score);

        JLabel lastScorer = new JLabel("Last Scorer: N/A",JLabel.CENTER);
        panel.add(lastScorer);

        JLabel winner = new JLabel("Winner: DRAW",JLabel.CENTER);
        panel.add(winner);

        buttonMilan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                milan++;
                score.setText("Result: " + milan + "X" + real);
                lastScorer.setText("Last Scorer: AC Milan");
                if (milan > real)
                    winner.setText("Winner: AC Milan");
                else if (milan == real)
                    winner.setText("Winner: DRAW");
                else
                    winner.setText("Winner: Real Madrid");
            }
        });

        buttonReal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                real++;
                score.setText("Result: " + milan + "X" + real);
                lastScorer.setText("Last Scorer: Real Madrid");
                if (milan > real)
                    winner.setText("Winner: AC Milan");
                else if (milan == real)
                    winner.setText("Winner: DRAW");
                else
                    winner.setText("Winner: Real Madrid");
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        new Football();
    }
}
