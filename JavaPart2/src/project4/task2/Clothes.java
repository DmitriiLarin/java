package project4.task2;

public abstract class Clothes {
    private Size size;
    private int price;
    private String color;

    public Clothes(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public String getDescription() {
       return (" | Размер: " + size + "  Цена: " + price + " | Цвет: " + color);
    }
}
