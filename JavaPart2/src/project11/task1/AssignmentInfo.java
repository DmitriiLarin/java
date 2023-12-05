package project11.task1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AssignmentInfo {
    public static void main(String[] args) {
        System.out.println("Фамилия разработчика: Ахчизба");
        Date startDate = new Date(2023 - 1900, 8, 26, 21, 49);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        System.out.println("Дата получения (начала выполнения) задания: " + dateFormat.format(startDate));
        System.out.println("Дата сдачи задания: " + dateFormat.format(new Date()));
    }
}
