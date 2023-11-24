package pract21.task1;

import java.util.Arrays;
import java.util.List;

public class ArrayToListConverter {
    public static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }
}