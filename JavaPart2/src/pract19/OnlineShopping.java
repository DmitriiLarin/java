package pract19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OnlineShopping {
    public boolean makeShop() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите ИНН: ");
        String INN = in.nextLine();
        try {
            isINNOkay(INN);
        } catch (BadINNException e) {
            e.printStackTrace();
            System.out.println("ИНН недействителен. Он должен состоять из 12 арабских цифр.");
            return false;
        }
        return true;
    }
    private void isINNOkay(String INN) throws BadINNException {
        Pattern pattern = Pattern.compile("[0-9]{12}");
        Matcher matcher = pattern.matcher(INN);
        if (!matcher.find()) {
            throw new BadINNException("The INN is invalid. It should consist of 12 arabic numerals.");
        }
    }
}
