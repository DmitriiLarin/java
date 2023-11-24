package project3.part1.task4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n -> ");
        int n = in.nextInt();
        while (n <= 0){
            System.out.println("Ошибка! Повторите ввод -> ");
            n = in.nextInt();
        }
        Random random = new Random();
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int i = 0; i < n; i++)
            array1.add(random.nextInt(n));
        System.out.println("Первый массив: " + array1);
        for (int i = 0; i < n; i++)
            if (array1.get(i) % 2 == 0)
                array2.add(array1.get(i));
        System.out.println("Второй массив: " + array2);
    }
}
