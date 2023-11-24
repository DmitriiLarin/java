package project11.task4;

import java.io.CharArrayReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormatting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = in.nextInt();
        System.out.print("Введите месяц (1-12): ");
        int month = in.nextInt();
        System.out.print("Введите день (1-31): ");
        int day = in.nextInt();
        System.out.print("Введите часы: ");
        int hour = in.nextInt();
        System.out.print("Введите минуты: ");
        int minute = in.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);

        Date date = new Date(year-1900, month-1, day, hour, minute);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println(dateFormat.format(date));
    }
}
