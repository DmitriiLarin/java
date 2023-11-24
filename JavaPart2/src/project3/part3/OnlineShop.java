package project3.part3;

import java.text.NumberFormat;
import java.util.*;

public class OnlineShop {
    static String country = Converter.US;
    static NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
    static Map<String, Double> products = new HashMap<>();
    static Double sum = 0.0;

    static {
        products.put("Футболка", 100.0);
        products.put("Джинсы", 300.0);
        products.put("Юбка", 200.0);
        products.put("Платье", 170.0);
        products.put("Шорты", 150.0);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> cart = new ArrayList<>();

        System.out.println("- - - - - - - МАГАЗИН ОДЕЖДЫ - - - - - - -");
        showProducts(products);
        System.out.println("\nМЕНЮ \n" +
                "1 - сменить валюту\n" +
                "2 - добавить товар в корзину\n" +
                "3 - оплатить покупку");
        System.out.print("Выберите действие: ");
        int n = in.nextInt();

        while (n != 3) {
            if (n == 1) {
                System.out.println("\nВАЛЮТЫ \n1.Доллар \n2.Евро \n3.Юань");
                System.out.print("Выберите валюту: ");
                int v = in.nextInt();
                if (v == 1)
                    changeCurrency(Converter.US);
                else if (v == 2)
                    changeCurrency(Converter.FRANCE);
                else if (v == 3)
                    changeCurrency(Converter.CHINA);;
                showProducts(products);
            }
            else if (n == 2) {
                System.out.print("Введите название товара: ");
                String product = in.next();
                if (products.containsKey(product)) {
                    cart.add(product);
                    sum += products.get(product);
                    System.out.println("Товар добавлен!");
                }
                else
                    System.out.println("Товар не найден!");
            }
            System.out.print("Выберите действие: ");
            n = in.nextInt();
        }
        System.out.println("ВАША КОРЗИНА");
        System.out.println(cart);
        System.out.println("Сумма: " + numberFormat.format(sum.intValue()));
        System.out.println("\nПОКУПКА ОПЛАЧЕНА");
    }

    public static void showProducts(Map<String, Double> products) {
        System.out.println("\nТОВАРЫ");
        for (Map.Entry<String, Double> product : products.entrySet()){
            System.out.println(product.getKey() + " | " + numberFormat.format(product.getValue().intValue()));
        }
    }

    public static void changeCurrency(String newCountry) {

        for (Map.Entry<String, Double> product : products.entrySet()){
            product.setValue(Converter.convert(country, newCountry, product.getValue()));
        }
        sum = Converter.convert(country, newCountry, sum);
        country = newCountry;
        numberFormat = Converter.getFormat(newCountry);
        String name = "hey";
        name = "bye";
    }
}
