package Data_Structures;

import java.util.Scanner;

public class SuperPallindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(reverseString(str));
        scan.close();
    }

    public static String reverseString(String input) {
        String result = "";
        String revString = input;
        StringBuilder rev = new StringBuilder();
        revString = revString.replaceAll("\\s+", "");

        for (int i = revString.length() -1; i >= 0; i--) {
            rev.append(revString.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                rev.insert(i, ' ');
            }
        }
        result = rev.toString();
        return result;
    }
}
