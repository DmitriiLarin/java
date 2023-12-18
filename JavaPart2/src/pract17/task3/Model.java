package pract17.task3;

import java.util.ArrayList;
import java.util.List;

public class Model
{
    private String SchoolAddress;
    private String SchoolName;
    private List<Student> studentList = new ArrayList<Student>();

    public class Student
    {
        private String name;
        private double avgScore;
        private int age;

        public Student(String name, double avgScore, int age)
        {
            this.age = age;
            this.avgScore = avgScore;
            this.name = name;
        }

        public double getAvgScore() {
            return avgScore;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    public String getSchoolAddress() {
        return SchoolAddress;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolAddress(String schoolAddress) {
        SchoolAddress = schoolAddress;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public void addingStudent(String name, int age, double avg)
    {
        studentList.add(new Student(name, avg, age));
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
