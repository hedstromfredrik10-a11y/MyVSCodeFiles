package Strings;

import java.util.Scanner;

/* "'._@?!"
 */

/*  He is a very very good boy, isn't he?
 */
public class Java_String_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        s = s.replaceAll("[^A-Za-z0-9]", " ");

        String[] arr = s.trim().split("\\s+");

        if (s.isBlank()) {
            System.out.println("0");
        } else {
            System.out.println(arr.length);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

        scan.close();
    }
}
