package project4.task2;

public class Skirt extends Clothes implements WomenClothing{
    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String dressWomen() {
        return ("Юбка" + getDescription());
    }
}
