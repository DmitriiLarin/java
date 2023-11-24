package project7.task4;

public class MathFunc implements MathCalculable {
    @Override
    public double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double calculateComplexModulus(double realPart, double imaginaryPart) {
        return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
    }

    public double calculateCircleLength(double radius) {
        return 2 * PI * radius;
    }

    public double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        MathFunc mc = new MathFunc();
        System.out.println(mc.calculatePower(2, 2));
        System.out.println(mc.calculateComplexModulus(1, 1));
        System.out.println(mc.calculateCircleLength(5));
        System.out.println(mc.calculateCircleArea(5));
    }
}
