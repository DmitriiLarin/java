package project9.task2;

import project9.task1.Student;

import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.getGPA(), student1.getGPA());
    }
    public static void sort(List<Student> students) {
        QuickSort.quickSort(students, new SortingStudentsByGPA());
    }
}
