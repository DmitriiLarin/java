package project8;

import java.util.Scanner;

public class GetOddNumbers {
    public static void getOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int currentNumber = scanner.nextInt();

        if (currentNumber == 0) {
            return;
        }
        if (currentNumber%2==0) {
            System.out.println(currentNumber);
        }

        getOddNumbers();
    }
}
