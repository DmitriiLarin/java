package project6.task11;

public class TemperatureConverter implements Convertable{
    public static void main(String[] args) {
        double celsius = 25.0;
        Convertable converter = new TemperatureConverter();

        double[] temperatures = converter.convert(celsius);
        double kelvin = temperatures[0];
        double fahrenheit = temperatures[1];

        System.out.println(celsius + " градусов Цельсия = " + kelvin + " Кельвин");
        System.out.println(celsius + " градусов Цельсия = " + fahrenheit + " Фаренгейт");
    }
    @Override
    public double[] convert(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 9/5) + 32;

        double[] results = {kelvin, fahrenheit};
        return results;
    }
}
