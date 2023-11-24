package project2.task4;

import java.util.Scanner;

public class ShopTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shop shop = new Shop();
        System.out.println("0 - закончить работу\n" +
                "1 - узнать количество товара\n" +
                "2 - удалить компьютер\n" +
                "3 - добавить компьютер\n" +
                "4 - найти товар\n");
        System.out.print("Выберите -> ");
        int choise = in.nextInt();
        int computerCount;
        while (choise != 0) {
            switch (choise) {
                case 1:
                    System.out.println(shop.toString());
                    break;
                case 2:
                    System.out.print("Введите количество удаляемых компьютеров -> ");
                    computerCount = in.nextInt();
                    for (int i = 0; i < computerCount; i++) {
                        System.out.print("Введите название -> ");
                        String name = in.next();
                        shop.deleteComputer(name);
                    }
                    break;
                case 3:
                    System.out.print("Введите количество добавляемых компьютеров -> ");
                    computerCount = in.nextInt();
                    for (int i = 0; i < computerCount; i++) {
                        System.out.print("Введите название -> ");
                        String name = in.next();
                        shop.addComputer(name);
                    }
                    break;
                case 4:
                    System.out.print("Введите название -> ");
                    String name = in.next();
                    if (shop.find(name))
                        System.out.println("Товар найден!");
                    else
                        System.out.println("Товар не найден!");
                    break;
                default:
                    System.out.println("Повторите ввод!");
                    break;
            }
            System.out.print("Выберите -> ");
            choise = in.nextInt();
        }
    }
}
