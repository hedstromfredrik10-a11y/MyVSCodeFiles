package Strings;

import java.util.Scanner;

public class Java_Strings_Introduction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A = scan.nextLine();
        String B = scan.nextLine();

        System.out.println(A.length() + B.length());

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String capitalA = A.substring(0, 1).toUpperCase();
        String capitalB = B.substring(0, 1).toUpperCase();

        StringBuilder resultA = new StringBuilder();
        StringBuilder resultB = new StringBuilder();

        resultA.append(capitalA).append(A.substring(1, A.length()));
        resultB.append(capitalB).append(B.substring(1, B.length()));

        System.out.println(resultA + " " + resultB);

        scan.close();
    }
}
