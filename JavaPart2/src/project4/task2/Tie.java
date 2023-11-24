package project4.task2;

public class Tie extends Clothes implements MenClothing {

    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String dressMen() {
        return ("Галстук" + getDescription());
    }
}
