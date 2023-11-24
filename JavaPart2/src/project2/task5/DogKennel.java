package project2.task5;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {
    private ArrayList<Dog> dogs = new ArrayList<>();

    public void addDog(int n) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Введите имя -> ");
            String name = in.next();
            System.out.print("Введите возраст -> ");
            int age = in.nextInt();
            dogs.add(new Dog(name, age));
        }
    }

    public static void main(String[] args) {
        DogKennel kennel = new DogKennel();
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько собак добавить? -> ");
        int n = in.nextInt();
        kennel.addDog(n);
        System.out.println(kennel.dogs.toString());
        for (int i = 0; i < kennel.dogs.size(); i++) {
            System.out.println("Человеческий возраст собаки " + kennel.dogs.get(i).getName() + ": " + kennel.dogs.get(i).humanAge());
        }
    }
}
