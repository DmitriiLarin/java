package project4.task2;

public class Atelier {

    public void dressWomen(Clothes[] clothes) {
        System.out.println("ЖЕНСКАЯ ОДЕЖДА");
        int count = 1;
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                System.out.print(count + ". ");
                System.out.println(((WomenClothing) item).dressWomen());
                count++;
            }
        }
    }

    public void dressMen(Clothes[] clothes) {
        System.out.println("МУЖСКАЯ ОДЕЖДА");
        int count = 1;
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                System.out.print(count + ". ");
                System.out.println(((MenClothing) item).dressMen());
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Atelier atelier = new Atelier();
        Clothes[] clothes = new Clothes[]{new Tie(Size.S, 500, "Чёрный"),
                new Skirt(Size.M, 500, "Белый"),
                new TShirt(Size.XS, 1000, "Чёрный"),
                new Pants(Size.L, 700, "Красный"),
                new TShirt(Size.M, 1200, "Розовый"),
                new Pants(Size.XXS, 1700, "Зеленый")};
        atelier.dressMen(clothes);
        atelier.dressWomen(clothes);
    }
}
