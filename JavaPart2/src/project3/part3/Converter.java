package project3.part3;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;

public class Converter {
    final static public String CHINA = "CHINA";
    final static public String US = "US";
    final static public String FRANCE = "FRANCE";
    final static public NumberFormat CHINA_FORMAT = NumberFormat.getCurrencyInstance(Locale.CHINA);
    final static public NumberFormat US_FORMAT = NumberFormat.getCurrencyInstance(Locale.US);
    final static public NumberFormat FRANCE_FORMAT = NumberFormat.getCurrencyInstance(Locale.FRANCE);

    public static Double convert(String country, String newCountry, Double price){
        Double newPrice = 0.0;
        switch (newCountry) {
            case CHINA:
                if (country.equals(US))
                    newPrice = price * 7.36;
                if (country.equals(FRANCE))
                    newPrice = price * 7.88;
                break;
            case FRANCE:
                if (country.equals(US))
                    newPrice = price * 0.933613;
                if (country.equals(CHINA))
                    newPrice = price * 0.126932;
                break;
            case US:
                if (country.equals(CHINA))
                    newPrice = price * 0.135957;
                if (country.equals(FRANCE))
                    newPrice = price * 1.07;
                break;
        }
        return newPrice;
    }

    public static NumberFormat getFormat(String newCountry) {
        switch (newCountry) {
            case CHINA:
                return CHINA_FORMAT;
            case US:
                return US_FORMAT;
            case FRANCE:
                return FRANCE_FORMAT;
        }
        return null;
    }
}
