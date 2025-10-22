package Strings;

/* import java.lang.reflect.Array;
 */
import java.util.Arrays;
import java.util.Scanner;

/* Sample Input 0

anagram
margana
Sample Output 0

Anagrams */

public class Java_Anagrams_Tenta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        boolean flag = false;

        str1 = "" + str1.toLowerCase();
        str2 = "" + str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (arr1.length != arr2.length) {
            flag = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    i = arr1.length;
                    flag = false;
                } else {
                    flag = true;
                }
            }

        }

        if (flag == true) {
            System.out.println("Anagrams");
        } else if (flag == false) {
            System.out.println("Not Anagrams");
        }

        scan.close();
    }

}
