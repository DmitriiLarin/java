package project10.comparators;

import project10.Student;

import java.util.Comparator;

public class ComparatorByGPA implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getGPA(), s2.getGPA());
    }
}
