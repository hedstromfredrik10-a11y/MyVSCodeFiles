package Problems;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());

        System.out.println(isPalindrome(input));

        scan.close();

    }

    public static boolean isPalindrome(int x) {
        boolean result = false;

        String inputToString = String.valueOf(x);
        StringBuilder compare = new StringBuilder();

        for (int i = inputToString.length() - 1; i >= 0; i--) {
            compare.append(inputToString.charAt(i));

        }

        if (inputToString.equals(compare.toString())) {
            return result = true;

        } else {
            return result = false;
        }

    }

}