package Strings;

import java.util.Scanner;


// Sample Input

// 5
// Goodbye bye bye world world world
// Sam went went to to to his business
// Reya is is the the best player in eye eye game
// in inthe
// Hello hello Ab aB
// Sample Output

// Goodbye bye world
// Sam went to his business
// Reya is the best player in eye game
// in inthe
// Hello Ab 


public class Java_Regex_2_Duplicate_Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int n = scan.nextInt();
        scan.nextLine();

        while (counter < n) {
            String input = scan.nextLine();
            System.out.println(cleanUpString(input));
            counter++;
        }

        scan.close();
    }

    public static String cleanUpString(String str) {
        String[] arr = str.split("\\s+");
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            for (int k = (i + 1); k < arr.length; k++) {
                if (arr[i].equalsIgnoreCase(arr[k])) {
                    arr[k] = "\b";
                }
            }
        }

        for (String s : arr) {
            newString.append(s).append(" ");
        }

        return newString.toString();
    }
}
