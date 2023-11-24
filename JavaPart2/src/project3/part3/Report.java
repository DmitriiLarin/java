package project3.part3;

import java.util.Scanner;

public class Report {
    public static void generateReport(Employee [] arr) {
        System.out.println("- - - Информация о зарплате всех сотрудников - - -");
        System.out.printf("%-30s %15s%n","ФИ сотрудника","Зарплата");
        for(Employee emp:arr) {
            String fullname = emp.getFullname();
            double salary = emp.getSalary();
            System.out.printf("%-30s %15.2f%n", fullname, salary);
        }
    }
    public static void main(String[] args) {
        System.out.print("Введите количество сотрудников: ");
        Scanner source=new Scanner(System.in);
        int size=source.nextInt();
        source.nextLine();
        Employee[] arr=new Employee[size];
        for (int i=0;i<size;i++) {
            System.out.print((i + 1) + "\nВведите фамилию и имя: ");
            String fullname = source.nextLine();
            System.out.print("Введите зарплату: ");
            double salary = source.nextDouble();
            source.nextLine();
            arr[i]=new Employee(fullname,salary);
        }
        generateReport(arr);
    }
}
