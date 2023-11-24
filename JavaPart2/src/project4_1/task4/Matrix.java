package project4_1.task4;

public class Matrix {
    private double [][] matrix;
    private int rows;
    private int columns;
    public Matrix (int rows,int columns,double[][]matrix) {
        this.rows = rows;
        this.columns=columns;
        this.matrix=matrix;
    }

    public Matrix add(Matrix matrix2) {
        if (this.rows != matrix2.rows || this.columns != matrix2.columns)
            throw new IllegalArgumentException("Размеры матриц не совпадают.");
        double[][] result = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = this.matrix[i][j] + matrix2.matrix[i][j];
            }
        }
        return new Matrix(rows, columns, result);
    }

    public Matrix multiplyByNum(double num) {
        double[][] result = new double[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result[i][j] = this.matrix[i][j] * num;
                }
            }
            return new Matrix(rows, columns, result);
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Matrix multiply(Matrix matrix2) {
        if (this.columns != matrix2.rows)
            System.out.println("Неправильные размеры матриц для умножения.");
        double [][] result=new double[this.rows][matrix2.columns];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < matrix2.columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    result[i][j] += this.matrix[i][k] * matrix2.matrix[k][j];
                }
            }
        }
        return new Matrix(rows, columns, result);
    }
}
