package BigNumber;

import java.util.Scanner;

public class Java_Primality_Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();

        boolean flag = false;

        if (n == 2 || n == 3) {
            flag = true;
        } else {
            for (int i = 1; i <= n; i++) {
                if ((6 * i) + 1 == n || (6 * i) - 1 == n) {
                    flag = true;
                }
            }
        }

        if (flag) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        scan.close();

    }
}
