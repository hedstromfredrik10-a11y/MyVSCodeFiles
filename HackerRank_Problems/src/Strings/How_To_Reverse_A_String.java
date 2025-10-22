package Strings;

import java.util.Scanner;

public class How_To_Reverse_A_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv in en text: ");
        String minText = scan.nextLine();

        StringBuilder reversedString = new StringBuilder();

        for (int i = minText.length() - 1; i >= 0; i--) {
            reversedString.append(minText.charAt(i));
        }
        
        System.out.println(reversedString);
        scan.close();
    }
}
