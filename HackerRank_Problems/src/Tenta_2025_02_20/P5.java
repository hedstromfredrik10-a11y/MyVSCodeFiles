package Tenta_2025_02_20;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "Hej hur   mår  du?";
        String capital = "mår";
        System.out.println(stringBoldConverter(input, capital));

        scan.close();
    }

    public static String stringBoldConverter(String input, String capital) {
        StringBuilder sb = new StringBuilder();
        String[] arr = input.split(" ");
        for (String s : arr) {
            if (s.equalsIgnoreCase(capital)) {
                sb.append(s.toUpperCase()).append(" ");
            } else {
                sb.append(s).append(" ");
            }
        }

        return sb.toString();
    }
}
