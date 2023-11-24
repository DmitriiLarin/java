package pract17.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class StudentView extends Observable {
    JFrame frame;
    JPanel panel;
    JTextArea studentInfo;
    JTextField studentName;
    JTextField studentRollNo;

    public void showApp() {
        frame = new JFrame("Student Info");
        frame.setSize(250, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        studentName = new JTextField("Name", 15);
        studentRollNo = new JTextField("RollNo", 15);
        studentInfo = new JTextArea();
        studentInfo.setEditable(false);

        JButton updateButton = new JButton("Update");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Map<String, Object> data = new HashMap<>();
                data.put("name", studentName.getText());
                data.put("rollNo", studentRollNo.getText());
                setChanged();
                notifyObservers(data);
            }
        });

        panel.add(studentName);
        panel.add(studentRollNo);
        panel.add(updateButton);
        panel.add(studentInfo);

        frame.add(panel);
        frame.setVisible(true);
    }


    public void updateStudent(String name, String rollNo) {
        studentInfo.setText("STUDENT INFO\nName: " + name + "\nRollNo: " + rollNo);
    }
}