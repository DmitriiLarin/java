package project3.part2.task1;

public class Task1 {
    public static void main(String[] args) {
        double a = 0.5;
        Double A = Double.valueOf(a);
        String b = "1.5603";
        Double B = Double.parseDouble(b);
        Double C = 1.234567890123456;

        double doubleC = C.doubleValue();
        int intC = C.intValue();
        byte byteC = C.byteValue();
        long longC = C.longValue();
        short shortC = C.shortValue();
        float floatC = C.floatValue();
        boolean booleanC = (C!=0);
        char charC = C.toString().charAt(0);
        System.out.println("Перевод в примитивные типы: ");
        System.out.println("double: " + doubleC);
        System.out.println("int: " + intC);
        System.out.println("long: " + longC);
        System.out.println("short: " + shortC);
        System.out.println("byte: " + byteC);
        System.out.println("float: " + floatC);
        System.out.println("boolean: " + booleanC);
        System.out.println("char: " + charC);

        System.out.println("Double: " + A + " " + B + " " + C);
        String d = Double.toString(3.14);

    }
}
