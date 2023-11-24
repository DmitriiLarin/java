package project4.task1;

public class SeasonTester {
    public static void loveSeason(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
        }
    }

    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        for (Season season:Season.values()) {
            System.out.println(season + " " + season.getDescription() + " | Средняя температура: " + season.getTemp());
        }
        loveSeason(autumn);
    }
}
