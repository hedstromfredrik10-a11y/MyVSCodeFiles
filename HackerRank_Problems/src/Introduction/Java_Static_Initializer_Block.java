package Introduction;

import java.util.Scanner;

/* Input Format

There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of the parallelogram.

Constraints

-100 <= B <= 100
-100 <= H <= 100

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. 
Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive */

public class Java_Static_Initializer_Block {

    static int B;
    static int H;
    static boolean flag = true;

    static {
        Scanner scan = new Scanner(System.in);

        B = scan.nextInt();
        H = scan.nextInt();

        if (B <= 0 || H <= 0) {
            flag = false;

            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }
        scan.close();
    }

    public static void main(String[] args) {

        if (flag == true) {
            System.out.println(B * H);
        }

    }
}
