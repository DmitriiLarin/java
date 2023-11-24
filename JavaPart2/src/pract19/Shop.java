package pract19;

public class Shop {
    public static void main(String[] args) {
        boolean isOkay = false;
        OnlineShopping onlineShopping = new OnlineShopping();
        while (!isOkay) {
            isOkay = onlineShopping.makeShop();
        }
        System.out.println("Покупка совершена!");
    }
}
