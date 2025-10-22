package Strings;

import java.util.Scanner;

public class Java_Substring_Tenta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        int heltal1 = scan.nextInt();
        int heltal2 = scan.nextInt();

        String result = str.substring(heltal1, heltal2);

        System.out.println(result);
        scan.close();

    }
}
