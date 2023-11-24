package project2.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = in.nextLine();
        int words = text.toString().replaceAll("\n", " ").split(" ").length;
        System.out.println("Слов в тексте: " + words);
    }
}
