package project10.comparators;

import project10.Student;

import java.util.Comparator;

public class ComparatorByGroup implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getGroup().compareTo(s2.getGroup());
    }
}
