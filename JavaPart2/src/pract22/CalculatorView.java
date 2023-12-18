package pract22;

import javax.swing.*;
import java.awt.*;

public class CalculatorView
{
    private JFrame frame;
    private JPanel panelMain;
    private JPanel panelGrid;
    private JPanel panelText;
    private JLabel label;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonMultiply;
    private JButton buttonDivision;
    private JButton buttonEqual;
    private JButton buttonPoint;
    private JButton buttonC;
    private JButton buttonBackSpace;
    private JButton buttonOpenBracket;
    private JButton buttonCloseBracket;

    public CalculatorView()
    {
        start();
    }

    public void start()
    {
        frame = new JFrame("Calculator");
        frame.setBounds(1920 / 2 - 270, 540 - 360, 540, 720);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panelMain = new JPanel(new BorderLayout());
        panelGrid = new JPanel(new GridLayout(5,4));
        panelText = new JPanel();

        initButtons();
        intiText();

        frame.add(panelMain);
        frame.setVisible(true);
    }

    public void initButtons()
    {
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivision = new JButton("/");
        buttonEqual = new JButton("=");
        buttonPoint = new JButton(".");
        buttonOpenBracket = new JButton("(");
        buttonCloseBracket = new JButton(")");
        buttonBackSpace = new JButton();
        buttonC = new JButton("C");

        button0.setFont(button0.getFont().deriveFont(22f));
        button1.setFont(button1.getFont().deriveFont(22f));
        button2.setFont(button2.getFont().deriveFont(22f));
        button3.setFont(button3.getFont().deriveFont(22f));
        button4.setFont(button4.getFont().deriveFont(22f));
        button5.setFont(button5.getFont().deriveFont(22f));
        button6.setFont(button6.getFont().deriveFont(22f));
        button7.setFont(button7.getFont().deriveFont(22f));
        button8.setFont(button8.getFont().deriveFont(22f));
        button9.setFont(button9.getFont().deriveFont(22f));
        buttonPlus.setFont(buttonPlus.getFont().deriveFont(22f));
        buttonMinus.setFont(buttonMinus.getFont().deriveFont(22f));
        buttonMultiply.setFont(buttonMultiply.getFont().deriveFont(22f));
        buttonDivision.setFont(buttonDivision.getFont().deriveFont(22f));
        buttonEqual.setFont(buttonEqual.getFont().deriveFont(22f));
        buttonPoint.setFont(buttonPoint.getFont().deriveFont(22f));
        buttonC.setFont(buttonC.getFont().deriveFont(22f));
        buttonOpenBracket.setFont(buttonOpenBracket.getFont().deriveFont(22f));
        buttonCloseBracket.setFont(buttonCloseBracket.getFont().deriveFont(22f));

        buttonBackSpace.setIcon(new ImageIcon("C:/Users/Gorkinpot/Downloads/iconBackSpace.png"));

        panelGrid.add(buttonOpenBracket);
        panelGrid.add(buttonCloseBracket);
        panelGrid.add(buttonBackSpace);
        panelGrid.add(buttonC);
        panelGrid.add(button1);
        panelGrid.add(button2);
        panelGrid.add(button3);
        panelGrid.add(buttonDivision);
        panelGrid.add(button4);
        panelGrid.add(button5);
        panelGrid.add(button6);
        panelGrid.add(buttonMultiply);
        panelGrid.add(button7);
        panelGrid.add(button8);
        panelGrid.add(button9);
        panelGrid.add(buttonMinus);
        panelGrid.add(button0);
        panelGrid.add(buttonPoint);
        panelGrid.add(buttonPlus);
        panelGrid.add(buttonEqual);

        panelMain.add(panelGrid, BorderLayout.CENTER);
    }

    public void intiText()
    {
        label = new JLabel("0");
        label.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        label.setPreferredSize(new Dimension(500, 300));
        label.setFont(label.getFont().deriveFont(26f));

        panelText.setPreferredSize(new Dimension(540, 300));
        panelText.add(label);

        panelMain.add(panelText, BorderLayout.NORTH);
    }

    public JLabel getLabel() {
        return label;
    }

    public JButton getButton0() {
        return button0;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public JButton getButton4() {
        return button4;
    }

    public JButton getButton5() {
        return button5;
    }

    public JButton getButton6() {
        return button6;
    }

    public JButton getButton7() {
        return button7;
    }

    public JButton getButton8() {
        return button8;
    }

    public JButton getButton9() {
        return button9;
    }

    public JButton getButtonCloseBracket() {
        return buttonCloseBracket;
    }

    public JButton getButtonOpenBracket() {
        return buttonOpenBracket;
    }

    public JButton getButtonMinus() {
        return buttonMinus;
    }

    public JButton getButtonPlus() {
        return buttonPlus;
    }

    public JButton getButtonMultiply() {
        return buttonMultiply;
    }

    public JButton getButtonDivision() {
        return buttonDivision;
    }

    public JButton getButtonEqual() {
        return buttonEqual;
    }

    public JButton getButtonPoint() {
        return buttonPoint;
    }

    public JButton getButtonBackSpace() {
        return buttonBackSpace;
    }

    public JButton getButtonC() {
        return buttonC;
    }
}
