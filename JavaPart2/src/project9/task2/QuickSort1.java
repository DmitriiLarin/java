package project9.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuickSort1 {
    public static <T> void quickSort(List<T> list, Comparator<T> comparator) {
        if (list.size() < 2)
            return; // базовый случай (массивы из 0 или 1 элемента)
        else {
            T pivot = list.get(0);
            List<T> less = new ArrayList<>();
            List<T> greater = new ArrayList<>();
            for (int i = 1; i < list.size(); i++) {
                if (comparator.compare(list.get(i), pivot) > 0)
                    greater.add(list.get(i));
                else if (comparator.compare(list.get(i), pivot) <= 0)
                    less.add(list.get(i));
            }
            quickSort(less, comparator);
            quickSort(greater, comparator);

            list.clear(); // Очищаем исходный список

            list.addAll(less); // Добавляем элементы из less
            list.add(pivot); //  добавляем pivot
            list.addAll(greater); // Добавляем элементы из greater
        }
    }
}
