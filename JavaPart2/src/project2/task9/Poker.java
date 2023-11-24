package project2.task9;

import java.util.ArrayList;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] suits = {"Черви", "Бубны", "Пики", "Трефы"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "D", "K", "T"};
        ArrayList<String> cards = new ArrayList<>();

        for (String suit : suits)
            for (String number : numbers)
                cards.add(number +  "|" + suit);

        System.out.print("Введите количество игроков (от 1 до 7) -> ");
        int n = in.nextInt();
        ArrayList<String> players = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringBuilder playerBuilder = new StringBuilder();
            for (int j = 0; j < 5; j++) {
                int index = (int)(Math.random() * cards.size());
                playerBuilder.append(cards.get(index)).append(" ");
                cards.remove(index);
            }
            players.add(playerBuilder.toString());
            System.out.println("Карты игрока: " + players.get(i));
        }
    }
}
