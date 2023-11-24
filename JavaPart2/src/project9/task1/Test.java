package project9.task1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Татьяна", 4, 1));
        students.add(new Student("Ульяна", 3, 2));
        students.add(new Student("Максим", 2, 3));
        students.add(new Student("Яна", 1, 4));

        InsertionSort.sort(students);
        System.out.println(students);
    }
}
