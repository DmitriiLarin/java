package project2.task1;


import project2.task1.Author;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя -> ");
        String name = in.nextLine();
        System.out.print("Введите почту -> ");
        String email = in.nextLine();
        System.out.print("Введите пол (м или ж) -> ");
        char gender = in.next().charAt(0);
        Author author = new Author(name, email, gender);
        System.out.println(author.toString());
        System.out.println("Имя: " + author.getName());
        System.out.println("Почта: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());
    }
}
