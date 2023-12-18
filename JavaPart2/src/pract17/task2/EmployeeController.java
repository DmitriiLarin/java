package pract17.task2;

public class EmployeeController
{
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view)
    {
        this.model = model;
        this.view = view;
    }

    public String getEmployeeName()
    {
        return model.getName();
    }

    public int getEmployeeSalary()
    {
        return model.getSalary();
    }

    public int getEmployeeTasks()
    {
        return model.getCompletedTasks();
    }

    public void setEmployeeName(String name)
    {
        model.setName(name);
    }

    public void setEmployeeSalary(int salary)
    {
        model.setSalary(salary);
    }

    public void setEmployeeTasks(int count)
    {
        model.setCompletedTasks(count);
    }

    public void UpdateView()
    {
        view.printEmployeeDetails(getEmployeeName(), getEmployeeSalary(), getEmployeeTasks());
    }
}
