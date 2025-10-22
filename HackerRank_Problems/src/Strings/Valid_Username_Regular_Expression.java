package Strings;

import java.util.Scanner;

public class Valid_Username_Regular_Expression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        int counter = 0;
        while (counter < n) {
            String str = scan.nextLine();
            System.out.println(validateUserName.result(str));

            counter++;
        }

        scan.close();

    }

}

class validateUserName {

    public static String result(String s) {
        String answer = "Valid";
        String regex = ".*[^a-zA-Z0-9 ].*";

        if (s.length() < 8 || s.length() > 30) {
            answer = "Invalid";
        }

        if (s.startsWith("_")) {
            answer = "Invalid";
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '_') {
                s = s.replaceAll(String.valueOf(s.charAt(i)), "");
            }
        }

        if (s.matches(regex)) {
            answer = "Invalid";
        }

        if (!(String.valueOf(s.charAt(0)).matches("[A-Za-z]"))) {
            answer = "Invalid";
        }

        return answer;
    }

}