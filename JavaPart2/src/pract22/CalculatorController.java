package pract22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;

        this.model.fillExpression(view.getLabel().getText());
    }

    public void UpdateView() {
        ActivateButtons();
    }

    public void ActivateButtons()
    {
        view.getButton0().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!model.getExpression().equals("0"))
                {
                    if(CalculatorModel.isAbleToAdd(view.getLabel().getText(), "0"))
                    {
                        view.getLabel().setText(view.getLabel().getText() + "0");
                    }
                }
                else
                {
                    view.getLabel().setText("0");
                }

                model.fillExpression(view.getLabel().getText());
            }
        });
        view.getButton1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!model.getExpression().equals("0"))
                {
                    if(CalculatorModel.isAbleToAdd(view.getLabel().getText(), "1"))
                    {
                        view.getLabel().setText(view.getLabel().getText() + "1");
                    }
                }

                model.fillExpression(view.getLabel().getText());
            }
        });
        view.getButton2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!model.getExpression().equals("0"))
                {
                    if(CalculatorModel.isAbleToAdd(view.getLabel().getText(), "2"))
                    {
                        view.getLabel().setText(view.getLabel().getText() + "2");
                    }
                }

                model.fillExpression(view.getLabel().getText());
            }
        });
        view.getButton3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!model.getExpression().equals("0"))
                {
                    if(CalculatorModel.isAbleToAdd(view.getLabel().getText(), "3"))
                    {
                        view.getLabel().setText(view.getLabel().getText() + "3");
                    }
                }

                model.fillExpression(view.getLabel().getText());
            }
        });
        view.getButton4().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!model.getExpression().equals("0"))
                {
                    if(CalculatorModel.isAbleToAdd(view.getLabel().getText(), "4"))
                    {
                        view.getLabel().setText(view.getLabel().getText() + "4");
                    }
                }

                model.fillExpression(view.getLabel().getText());
            }
        });
        view.getButton5().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!model.getExpression().equals("0"))
                {
                    if(CalculatorModel.isAbleToAdd(view.getLabel().getText(), "5"))
                    {
                        view.getLabel().setText(view.getLabel().getText() + "5");
                    }
                }

                model.fillExpression(view.getLabel().getText());
            }
        });
        view.getButton6().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!model.getExpression().equals("0"))
                {
                    if(CalculatorModel.isAbleToAdd(view.getLabel().getText(), "6"))
                    {
                        view.getLabel().setText(view.getLabel().getText() + "6");
                    }
                }

                model.fillExpression(view.getLabel().getText());
            }
        });
        view.getButton7().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!model.getExpression().equals("0"))
                {
                    if(CalculatorModel.isAbleToAdd(view.getLabel().getText(), "7"))
                    {
                        view.getLabel().setText(view.getLabel().getText() + "7");
                    }
                }

                model.fillExpression(view.getLabel().getText());
            }
        });

        view.getButton8().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!model.getExpression().equals("0"))
                {
                    if(CalculatorModel.isAbleToAdd(view.getLabel().getText(), "8"))
                    {
                        view.getLabel().setText(view.getLabel().getText() + "8");
                    }
                }

                model.fillExpression(view.getLabel().getText());
            }
        });

        view.getButton9().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!model.getExpression().equals("0"))
                {
                    if(CalculatorModel.isAbleToAdd(view.getLabel().getText(), "9"))
                    {
                        view.getLabel().setText(view.getLabel().getText() + "9");
                    }
                }

                model.fillExpression(view.getLabel().getText());
            }
        });

        view.getButtonPlus().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!model.getExpression().equals("0"))
                {
                    if(CalculatorModel.isAbleToAdd(view.getLabel().getText(), "+"))
                    {
                        view.getLabel().setText(view.getLabel().getText() + "+");
                    }
                }

                model.fillExpression(view.getLabel().getText());
            }
        });

        view.getButtonMinus().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!model.getExpression().equals("0"))
                {
                    if(CalculatorModel.isAbleToAdd(view.getLabel().getText(), "-"))
                    {
                        view.getLabel().setText(view.getLabel().getText() + "-");
                    }
                }

                model.fillExpression(view.getLabel().getText());
            }
        });

        view.getButtonMultiply().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!model.getExpression().equals("0"))
                {
                    if(CalculatorModel.isAbleToAdd(view.getLabel().getText(), "*"))
                    {
                        view.getLabel().setText(view.getLabel().getText() + "*");
                    }
                }

                model.fillExpression(view.getLabel().getText());
            }
        });

        view.getButtonDivision().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!model.getExpression().equals("0"))
                {
                    if(CalculatorModel.isAbleToAdd(view.getLabel().getText(), "/"))
                    {
                        view.getLabel().setText(view.getLabel().getText() + "/");
                    }
                }

                model.fillExpression(view.getLabel().getText());
            }
        });

        view.getButtonC().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getLabel().setText("0");
                model.fillExpression(view.getLabel().getText());
            }
        });

        view.getButtonBackSpace().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.getLabel().getText().length() > 1) {
                    view.getLabel().setText(view.getLabel().getText().substring(0, view.getLabel().getText().length() - 1));
                } else if (view.getLabel().getText().length() == 1) {
                    view.getLabel().setText("0");
                }
                model.fillExpression(view.getLabel().getText());
            }
        });

        view.getButtonOpenBracket().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (view.getLabel().getText().equals("0")) {
                    view.getLabel().setText("(");
                }
                else
                {
                    if (CalculatorModel.isAbleToAdd(view.getLabel().getText(), "("))
                    {
                        view.getLabel().setText(view.getLabel().getText() + "(");
                    }
                }

                model.fillExpression(view.getLabel().getText());
            }
        });

        view.getButtonCloseBracket().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!view.getLabel().getText().equals("0"))
                {
                    if (CalculatorModel.isAbleToAdd(view.getLabel().getText(), ")")) {
                        view.getLabel().setText(view.getLabel().getText() + ")");
                    }
                }
                model.fillExpression(view.getLabel().getText());
            }
        });

        view.getButtonEqual().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                model.evaluatePostfixExpression();
                System.out.println(model.getExpression());
                view.getLabel().setText(model.getExpression());
            }
        });

        view.getButtonPoint().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!view.getLabel().getText().equals("0"))
                {
                    if (CalculatorModel.isAbleToAdd(view.getLabel().getText(), ".")) {
                        view.getLabel().setText(view.getLabel().getText() + ".");
                    }
                }
                model.fillExpression(view.getLabel().getText());
            }
        });
    }
}