package project4_1.task7;

public class StudentTester {
    public static void main(String[] args) {
        Student[] students = new Student[]{new SchoolStudent("Эля"), new SchoolStudent("Таня"), new UniversityStudent("Саша"), new UniversityStudent("Ульяна"), new SchoolStudent("Марианна")};
        System.out.print("Студенты: ");
        for (Student student : students) {
            if (student.getClass() == UniversityStudent.class)
                System.out.print(student.name + " ");
        }
        System.out.println();
        System.out.print("Школьники: ");
        for (Student student : students) {
            if (student.getClass() == SchoolStudent.class)
                System.out.print(student.name + " ");
        }
    }
}
