package project10.comparators;

import project10.Student;

import java.util.Comparator;

public class ComparatorByCourse implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getCourse(), s2.getCourse());
    }
}