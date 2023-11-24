package project4.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing{
    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String dressMen() {
        return ("Мужские брюки" + getDescription());
    }

    @Override
    public String dressWomen() {
        return ("Женские брюки" + getDescription());
    }
}
