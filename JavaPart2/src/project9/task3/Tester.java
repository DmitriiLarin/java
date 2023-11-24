package project9.task3;

import project9.task1.InsertionSort;
import project9.task1.Student;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Татьяна", 4, 1));
        students1.add(new Student("Ульяна", 3, 2));
        students1.add(new Student("Максим", 2, 3));
        students1.add(new Student("Яна", 1, 4));
        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Марианна", 8, 5));
        students2.add(new Student("Михаил", 5, 6));
        students2.add(new Student("Светлана", 6, 7));
        students2.add(new Student("Александра", 7, 8));

        List<Student> students = merge(students1, students2);
        System.out.println(students);
    }

    public static List<Student> merge(List<Student> students1, List<Student> students2) {
        InsertionSort.sort(students1);
        InsertionSort.sort(students2);

        List<Student> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < students1.size() && j < students2.size()) {

            if (students1.get(i).compareTo(students2.get(j)) < 0) {
                mergedList.add(students1.get(i++));
            } else {
                mergedList.add(students1.get(i++));
            }
        }

        while (i < students1.size()) {
            mergedList.add(students1.get(i++));
        }

        while (j < students2.size()) {
            mergedList.add(students2.get(j++));
        }

        return mergedList;
    }
}
