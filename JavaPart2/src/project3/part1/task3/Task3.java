package project3.part1.task3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[4];
        for (int i = 0; i < 4; i++)
            array[i] = random.nextInt(89) + 10;
        System.out.println(Arrays.toString(array));
        boolean increasingSequence = true;
        for (int i = 0; i < 3; i++)
            if (array[i] >= array[i+1]) {
                increasingSequence = false;
                break;
            }
        if (increasingSequence)
            System.out.println("Массив является строго возрастающей последовательностью");
        else
            System.out.println("Массив не является строго возрастающей последовательностью");
    }
}
