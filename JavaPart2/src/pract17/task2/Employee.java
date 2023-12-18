package pract17.task2;

public class Employee
{
    private String name;
    private int salary;
    private int completedTasks;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getCompletedTasks() {
        return completedTasks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary + (salary / 100 * completedTasks);
    }

    public void setCompletedTasks(int completedTasks) {
        this.completedTasks = completedTasks;
    }
}


