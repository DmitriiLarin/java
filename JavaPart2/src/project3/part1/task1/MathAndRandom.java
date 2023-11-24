package project3.part1.task1;

import java.util.Arrays;
import java.util.Random;

public class MathAndRandom {
    public static void main(String[] args) {
        int size = (int) (Math.random() * 10);
        double[] arr = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextDouble();
        }
        System.out.println("Размер массива: " + size);
        System.out.println("Массив: " + Arrays.toString(arr));
    }
}
