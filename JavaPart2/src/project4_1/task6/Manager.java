package project4_1.task6;

public class Manager extends Employer {
    public static void main(String[] args) {
        Employer manager1 = new Manager("Таня", "Порсева", 1000, 100);
        Employer manager2 = new Manager("Максим", "Устинов", 100000, 1000);
        Employer employer1 = new Employer("Ульяна", "Салимова", 2200);
        Employer[] employers = new Employer[]{manager1, manager2, employer1};
        for (Employer employer : employers) {
            System.out.println(employer.getIncome());
        }
    }
    private double averageSum;
    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }
    @Override
    public double getIncome() {
        return super.getIncome() + averageSum;
    }
}
