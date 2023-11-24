package pract20;

public class Tester {
    public static void main(String[] args) {
        GenericClass<String, Integer, Double> genericClass = new GenericClass<>("Tanya", 1, 0.5);
        genericClass.displayValues();
    }
}
