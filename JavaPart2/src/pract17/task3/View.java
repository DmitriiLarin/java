package pract17.task3;

import javax.swing.*;
import java.awt.*;

public class View
{
    private JButton buttonName;
    private JButton buttonAddress;
    private JButton buttonStudents;
    private JTextArea label;

    public View()
    {
        initFrame();
    }

    public void initFrame()
    {
        JFrame frame = new JFrame("School Manage");
        frame.setBounds(1920 / 2 - 360, 540 - 270, 720 ,540);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(1, 3));
        buttonName = new JButton("School name");
        buttonAddress = new JButton("School address");
        buttonStudents = new JButton("Students info");
        panel.add(buttonName);
        panel.add(buttonAddress);
        panel.add(buttonStudents);

        JPanel panelView = new JPanel(new FlowLayout(FlowLayout.CENTER));
        label = new JTextArea();
        label.setPreferredSize(new Dimension(540, 440));
        label.setFont(label.getFont().deriveFont(20.0f));
        panelView.add(label);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(panelView, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public JButton getButtonAddress() {
        return buttonAddress;
    }

    public JButton getButtonName() {
        return buttonName;
    }

    public JButton getButtonStudents() {
        return buttonStudents;
    }

    public JTextArea getLabel() {
        return label;
    }
}
