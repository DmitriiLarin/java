package pract22;

import java.util.EmptyStackException;
import java.util.Stack;

public class CalculatorModel
{
    private String expression;
    private Stack<Double> stack;

    public CalculatorModel()
    {
        stack = new Stack<Double>();
    }

    public void fillExpression(String input)
    {
        this.expression = input;
        System.out.println(expression);
    }

    public String getExpression() {
        return expression;
    }

    public void evaluatePostfixExpression()
    {
        try
        {
            double firstOperand = 0;
            double secondOperand = 0;

            for(int i = 0; i < expression.length(); i++)
            {
                if (expression.charAt(i) == ')')
                {
                    int indexBra = i;
                    String tmpOper = "";

                    while(expression.charAt(indexBra) != '(')
                    {
                        indexBra--;
                    }

                    tmpOper = expression.substring(indexBra + 1, i);
                    System.out.println("tmpOper: " + tmpOper);

                    firstOperand = Double.parseDouble(tmpOper);
                    stack.push(firstOperand);
                }
                if(isOperator(Character.toString(expression.charAt(i))))
                {
                    secondOperand = stack.pop();
                    firstOperand = stack.pop();

                    switch(expression.charAt(i))
                    {
                        case '+': stack.push(firstOperand + secondOperand); break;
                        case '-': stack.push(firstOperand - secondOperand); break;
                        case '*': stack.push(firstOperand * secondOperand); break;
                        case '/':
                        {
                            if(secondOperand == 0) {expression = "Divide by zero!"; return;}
                            else {stack.push(firstOperand / secondOperand);break;}
                        }
                    }
                }
            }

            expression = Double.toString(stack.pop());
        }
        catch (EmptyStackException e)
        {
            System.out.println("Incorrect expression!");
            expression = "Incorrect expression!";
        }
    }

    public static boolean isAbleToAdd(String expression, String token) {
        int length = expression.length();

        System.out.println(expression);

        if (token.equals("(")) {
            if (length == 0 || isOperator(Character.toString(expression.charAt(length - 1))) || expression.endsWith(")")) {
                return true;
            }
        }
        else if (token.equals(")"))
        {
            if (isDigit(Character.toString(expression.charAt(length - 1)))) {
                return true;
            }
        }
        else if (isOperator(token))
        {
            if (expression.endsWith(")") || isOperator(Character.toString(expression.charAt(length - 1))))
            {
                return true;
            }
        }
        else if (isDigit(token)) {
            if (expression.endsWith(".") || expression.endsWith("(") || isDigit(Character.toString(expression.charAt(length - 1)))) {
                return true;
            }
        } else if (token.equals(".")) {
            if(isDigit(Character.toString(expression.charAt(expression.length() - 1))))
            {
                int flag = 0;
                for(int i = expression.length() - 1; expression.charAt(i) != '('; i--)
                {
                    if(expression.charAt(i) == '.') flag = 1;
                }
                if (flag == 0) return true;
            }
        }

        return false;
    }

    public static boolean isDigit(String token) {
        return token.matches("[0123456789]");
    }

    public static boolean isOperator(String str) {
        return str.matches("[+\\-*/]");
    }
}
