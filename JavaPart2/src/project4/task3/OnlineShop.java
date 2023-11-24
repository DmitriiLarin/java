package project4.task3;

import project4.task2.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineShop {
    private static boolean out = false;
    private static Scanner in = new Scanner(System.in);
    private static ArrayList<Product> cart = new ArrayList<>();
    private static int sum;

    public static void main(String[] args) {
        ArrayList<Clothes> cart = new ArrayList<>();

        System.out.println("- - - - > РЕГИСТРАЦИЯ");
        System.out.print("Введите логин -> ");
        String login = in.nextLine();
        System.out.print("Введите пароль -> ");
        String password = in.nextLine();
        System.out.println("- - - - - - > ВХОД");
        String loginProof;
        String passwordProof;
        do {
            System.out.print("Введите логин -> ");
            loginProof = in.nextLine();
            System.out.print("Введите пароль -> ");
            passwordProof = in.nextLine();
            if (!passwordProof.equals(password) || !loginProof.equals(login))
                System.out.println("Неверный логин или пароль! Повторите попытку.");
        } while (!passwordProof.equals(password) || !loginProof.equals(login));
        int n;
        while (!out) {
            showMenu();
            n = in.nextInt();
            switch (n) {
                case 1:
                    showCatalogs();
                    break;
                case 2:
                    showCart();
                    break;
            }
        }
        System.out.println("\nСпасибо, что выбрали наш магазин! ♥");
    }

    public static void showMenu() {
        System.out.println("- - - - - - > МЕНЮ" +
                "\n1.Просмотреть каталоги." +
                "\n2.Перейти к корзине.");
        System.out.print("Введите действие -> ");
    }

    public static void showCatalogs() {
        System.out.println("- - - - > КАТАЛОГИ" +
                "\n1.Молочные изделия." +
                "\n2.Сладости." +
                "\n3.Выпечка." +
                "\n4.Назад");
        System.out.print("Введите действие -> ");
        int n = in.nextInt();
        switch (n) {
            case 1:
                showMilkProducts();
                break;
            case 2:
                showSweets();
                break;
            case 3:
                showBakery();
                break;
            case 4:
                break;
        }
    }

    public static void showMilkProducts() {
        System.out.println("- - > МОЛОЧНЫЕ ПРОДУКТЫ" +
                "\n1." + Product.MILK.toString() +
                "\n2." + Product.ICE_CREAM.toString() +
                "\n3." + Product.CHEESE.toString() +
                "\n4.Назад");
        System.out.print("Введите номер продукта -> ");
        int n = in.nextInt();
        switch (n) {
            case 1:
                cart.add(Product.MILK);
                sum += Product.MILK.getPrice();
                System.out.println("Товар добавлен в корзину!");
                break;
            case 2:
                cart.add(Product.ICE_CREAM);
                sum += Product.ICE_CREAM.getPrice();
                System.out.println("Товар добавлен в корзину!");
                break;
            case 3:
                cart.add(Product.CHEESE);
                sum += Product.CHEESE.getPrice();
                System.out.println("Товар добавлен в корзину!");
                break;
            case 4:
                showCatalogs();
                break;
        }
    }

    public static void showSweets() {
        System.out.println("- - - > СЛАДОСТИ" +
                "\n1." + Product.CHOCOLATE.toString() +
                "\n2." + Product.CANDY.toString() +
                "\n3." + Product.COOKIE.toString() +
                "\n4.Назад");
        System.out.print("Введите номер продукта -> ");
        int n = in.nextInt();
        switch (n) {
            case 1:
                cart.add(Product.CHOCOLATE);
                sum += Product.CHOCOLATE.getPrice();
                System.out.println("Товар добавлен в корзину!");
                break;
            case 2:
                cart.add(Product.CANDY);
                sum += Product.CANDY.getPrice();
                System.out.println("Товар добавлен в корзину!");
                break;
            case 3:
                cart.add(Product.COOKIE);
                sum += Product.COOKIE.getPrice();
                System.out.println("Товар добавлен в корзину!");
                break;
            case 4:
                showCatalogs();
                break;
        }
    }

    public static void showBakery() {
        System.out.println("- - - - > ВЫПЕЧКА" +
                "\n1." + Product.BREAD.toString() +
                "\n2." + Product.BAGUETTE.toString() +
                "\n3." + Product.CIABATTA.toString() +
                "\n4.Назад");
        System.out.print("Введите номер продукта -> ");
        int n = in.nextInt();
        switch (n) {
            case 1:
                cart.add(Product.BREAD);
                sum += Product.BREAD.getPrice();
                System.out.println("Товар добавлен в корзину!");
                break;
            case 2:
                cart.add(Product.BAGUETTE);
                sum += Product.BAGUETTE.getPrice();
                System.out.println("Товар добавлен в корзину!");
                break;
            case 3:
                cart.add(Product.CIABATTA);
                sum += Product.CIABATTA.getPrice();
                System.out.println("Товар добавлен в корзину!");
                break;
            case 4:
                showCatalogs();
                break;
        }
    }

    public static void showCart() {
        System.out.println("ВАША КОРЗИНА");
        for (Product product : cart) {
            System.out.println("-> " + product.toString());
        }
        System.out.println("К оплате: " + sum + "руб");
        System.out.println("Оплатить? 1.Да 2.Нет");
        int answer = in.nextInt();
        if (answer == 1) {
            System.out.println("Оплата...");
            out = true;
        }
    }
}
