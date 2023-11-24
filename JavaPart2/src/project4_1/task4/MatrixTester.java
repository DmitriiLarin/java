package project4_1.task4;

import java.util.Scanner;

public class MatrixTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[][]matrix1={{1,4},{2,6}};
        double[][]matrix2={{3,7},{9,2}};
        Matrix matr1 = new Matrix(2,2,matrix1);
        Matrix matr2 = new Matrix(2,2,matrix2);
        System.out.println("Сложение матриц: " );
        Matrix summ=matr1.add(matr2);
        summ.print();
        System.out.println("Введите число, на которое хотите умножить матрицу: " );
        int n=in.nextInt();
        System.out.println("Результат умножения матрицы на число: ");
        Matrix mul=matr1.multiplyByNum(n);
        mul.print();
        System.out.println("Результат умножения матриц: ");
        Matrix mul12=matr1.multiply(matr2);
        mul12.print();
    }
}
