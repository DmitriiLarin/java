package project8;

public class Reverse {
    public static int reverse(int n) {
        return reverse(n, 0);
    }
    private static int reverse(int n, int reversed) {
        if (n == 0) {
            return reversed;
        } else {
            int lastDigit = n % 10;
            int remainingDigits = n / 10;
            reversed = reversed * 10 + lastDigit;
            return reverse(remainingDigits, reversed);
        }
    }
}
