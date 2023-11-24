package project4.task3;

public enum Product {
    MILK("Молоко", 60),
    ICE_CREAM("Мороженое", 80),
    CHEESE("Сыр", 190),
    CHOCOLATE("Шоколад", 120),
    COOKIE("Печенье", 200),
    CANDY("Конфета", 20),
    BREAD("Хлеб", 50),
    BAGUETTE("Багет", 60),
    CIABATTA("Чиабатта", 50);

    private int price;
    private String name;

    public int getPrice() {
        return price;
    }

    private Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return (name + " | " + price + "руб");
    }
}
