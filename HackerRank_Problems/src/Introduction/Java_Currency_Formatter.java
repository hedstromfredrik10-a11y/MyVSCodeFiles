package Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Java_Currency_Formatter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double value = scan.nextDouble();
        scan.close();

        Locale IND = new Locale("en", "IN");
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(IND);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(value));
        System.out.println("India: " + india.format(value));
        System.out.println("China: " + china.format(value));
        System.out.println("France: " + france.format(value));

    }

}