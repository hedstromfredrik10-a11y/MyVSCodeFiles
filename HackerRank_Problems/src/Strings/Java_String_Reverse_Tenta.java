package Strings;

import java.util.Scanner;

/* A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes */

public class Java_String_Reverse_Tenta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A = scan.nextLine();

        String Arev = "";

        StringBuilder reverseString = new StringBuilder();

        for (int i = A.length() - 1; i >= 0; i--) {
            reverseString.append(A.charAt(i));

        }

        Arev += reverseString;
        if (A.compareTo(Arev) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    
        scan.close();
    }
}
