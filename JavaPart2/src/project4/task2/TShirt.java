package project4.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing{

    public TShirt(Size size, int price, String color) {
        super(size, price, color);
    }
    @Override
    public String dressMen() {
        return ("Мужская футболка" + getDescription());
    }

    @Override
    public String dressWomen() {
        return ("Женская футболка" + getDescription());
    }
}
