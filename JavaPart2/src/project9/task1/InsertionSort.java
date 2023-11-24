package project9.task1;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort { // обобщенный класс InsertionSort, который может работать с объектами любого типа T, при условии,
    // что этот тип реализует интерфейс Comparable<T>
    // Когда мы говорим <T extends Comparable<T>>, мы говорим, что тип T должен быть подтипом (или самим) интерфейса Comparable<T>. Это означает,
    // что объекты типа T должны иметь метод compareTo, определенный в интерфейсе Comparable, чтобы их можно было сравнивать
    // Если бы мы использовали implements вместо extends, это бы означало, что T должен явно реализовать интерфейс Comparable, что
    // может быть некорректным, так как это означало бы, что классы, которые не могут быть изменены
    // (например, стандартные классы Java, такие как Integer или String), не могли бы использоваться с этим классом InsertionSort.
    public static <T extends Comparable<T>> void sort(List<T> list) {
        int n = list.size();

        for (int i = 1; i < n; i++) {
            T key = list.get(i);
            int j = i - 1;

            // Сдвигаем элементы, которые больше key, вправо
            while (j >= 0 && list.get(j).compareTo(key) > 0) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
    }
}

