package project2.task8;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество элементов массива -> ");
        int n = in.nextInt();
        String[] array = new String[n];
        System.out.println("Заполните массив словами -> ");
        for (int i = 0; i < n; i++) {
            array[i] = in.next();
        }
        System.out.println("Массив: " + Arrays.asList(array));

        String x;
        for (int i = 0; i < n / 2; i++) {
            x = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = x;
        }
        System.out.println("Массив в обратном порядке: " + Arrays.asList(array));
    }
}
