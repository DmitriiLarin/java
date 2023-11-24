package pract18.task1;

public class Exception1 {
    public void exceptionDemo1() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public void exceptionDemo2() {
        System.out.println( 2.0 / 0.0 );
    }
}
