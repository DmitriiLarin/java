package pract21.task2;

import java.util.Arrays;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(int size) {
        // Создаем массив нужного типа
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива");
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        // Создание объекта GenericArray для хранения целых чисел
        GenericArray<Integer> intArray = new GenericArray<>(5);

        intArray.set(0, 1);
        intArray.set(1, 2);
        intArray.set(2, 3);
        intArray.set(3, 4);
        intArray.set(4, 5);

        System.out.println("Массив целых чисел: " + intArray);

        // Создание объекта GenericArray для хранения строк
        GenericArray<String> stringArray = new GenericArray<>(3);

        stringArray.set(0, "hello");
        stringArray.set(1, "mirea");
        stringArray.set(2, "!");

        System.out.println("Массив строк: " + stringArray);
    }
}
