package project11.task3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    public static void main(String[] args) {
        Student student = new Student("Татьяна", "Порсева", new Date(2004-1900, 5, 12, 14, 30), "Программная инженерия", 2, "ИКБО-01-22", 5);
        System.out.println(student.toString(BirthdayDateFormat.SHORT));
        System.out.println(student.toString(BirthdayDateFormat.MEDIUM));
        System.out.println(student.toString(BirthdayDateFormat.FULL));
    }
    private String firstName;
    private String secondName;
    private String specialty;
    private int course;
    private String group;
    private int GPA;
    private Date birthday;

    public Student(String firstName, String secondName, Date birthday, String specialty, int course, String group, int GPA) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String toString(BirthdayDateFormat birthdayDateFormat) {
        return "Студент{" +
                "имя='" + firstName + '\'' +
                ", фамилия='" + secondName + '\'' +
                ", дата рождения='" + birthdayDateFormat.getDateFormat().format(birthday) + '\'' +
                ", специальность='" + specialty + '\'' +
                ", курс=" + course +
                ", группа='" + group + '\'' +
                ", средний балл=" + GPA +
                '}';
    }
}
