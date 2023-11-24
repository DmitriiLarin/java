package project2.task4;

import java.util.ArrayList;

public class Shop {
    ArrayList<String> computers = new ArrayList<>();
    private int computerCount = 0;

    public Shop() {
    }

    public void addComputer (String computer) {
        this.computerCount += 1;
        computers.add(computer);
    }

    public void deleteComputer (String computer) {
        this.computerCount -= 1;
        computers.remove(computer);
    }

    public boolean find (String name) {
        return computers.contains(name);
    }

    @Override
    public String toString() {
        return "Количество товара в магазине {" +
                "компьютеры=" + computerCount +
                '}';
    }
}
