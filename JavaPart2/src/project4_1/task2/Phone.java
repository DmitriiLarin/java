package project4_1.task2;

public class Phone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("89511940152", "iphone 11", 100);
        Phone phone2 = new Phone("89501690408", "redmi 9");
        Phone phone3 = new Phone();
        System.out.println("Модель первого телефона: " + phone1.getModel());
        System.out.println("Номер второго телефона: " + phone2.getNumber());
        System.out.println("Вес третьего телефона (не был задан): " + phone3.getWeight());
        phone1.receiveCall("Света");
        phone2.receiveCall("Мама", "89618456709");
        phone3.sendMessage("89006789050", "85019080905", "89108454647");
    }
    private String number = "";
    private String model = "";
    private int weight = 0;

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " | " + number);
    }

    public void sendMessage(String...numbers) {
        System.out.println("Сообщение было отправлено...");
        for (String s : numbers) {
            System.out.println("..." + s);
        }
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }
}
