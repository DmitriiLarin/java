package project9.task1;

public class Student implements Comparable<Student> {
    private String name;
    private Integer idNumber;
    private Integer GPA; //  Grade Point Average — это усредненный балл оценок

    public Student(String name, Integer idNumber, Integer GPA) {
        this.name = name;
        this.idNumber = idNumber;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public Integer getGPA() {
        return GPA;
    }

    @Override
    public int compareTo(Student o) {
        return (this.idNumber - o.idNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID=" + idNumber +
                ", GPA=" + GPA +
                '}';
    }
}
