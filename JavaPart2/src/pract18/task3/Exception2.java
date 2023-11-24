package pract18.task3;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("It's Exception!");
        } /* так как мы уже "поймали" исключение Exception, мы не можем "ловить" его наследников
        catch (NumberFormatException e) {
            System.out.println("It's NumberFormatException!");
        } catch (ArithmeticException e) {
           System.out.println("It's ArithmeticException");
        }*/
    }
}
