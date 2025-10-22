package Introduction;

import java.util.Scanner;

/* Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.
Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file. */

public class Java_End_Of_File_Tenta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = "";

        int counter = 1;
        while (!s.endsWith("end-of-file.")) {
            s = scan.nextLine();

            System.out.printf("%d %s %n", counter, s);

            counter++;

        }

        scan.close();
    }
}