package project8;

import java.util.Scanner;

public class CountOnes {
    public static int countOnes() {
        Scanner scanner = new Scanner(System.in);
        int currentNumber = scanner.nextInt();

        if (currentNumber == 0) {
            int nextNumber = scanner.nextInt();
            if (nextNumber == 0) {
                return 0; // Встретили два нуля подряд, завершаем рекурсию
            }
            else
                currentNumber = nextNumber;
        }

        int count = getOnes(currentNumber);

        // Рекурсивный вызов функции для обработки следующих чисел
        return count + countOnes();
    }

    private static int getOnes(int number) {
        int count = 0;

        while (number != 0) {
            int digit = number % 10; // Получаем последнюю цифру числа
            if (digit == 1) {
                count++;
            }
            number /= 10; // Убираем последнюю цифру из числа
        }

        return count;
    }
}