package project11.task2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ComparingDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Date currentDate = new Date();
        Date userDate = new Date();

        System.out.print("Введите год: ");
        int year = in.nextInt();
        System.out.print("Введите месяц (1-12): ");
        int month = in.nextInt();
        System.out.print("Введите день (1-31): ");
        int day = in.nextInt();

        userDate.setYear(year-1900);
        userDate.setMonth(month-1);
        userDate.setDate(day);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Текущая дата: " + dateFormat.format(currentDate));
        System.out.println("Введенная дата: " + dateFormat.format(userDate));
        if (userDate.compareTo(currentDate) < 0)
            System.out.println("Введенная вами дата предшествует текущей дате");
        else if (userDate.compareTo(currentDate) > 0)
            System.out.println("Введенная вами дата идет после текущей даты");
        else
            System.out.println("Введенная вами дата равна текущей дате");
    }
}
