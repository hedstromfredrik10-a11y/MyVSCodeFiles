package BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class Java_BigInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        BigInteger resultA = a.add(b);
        BigInteger resultB = a.multiply(b);

        System.out.println(resultA);
        System.out.println(resultB);

        scan.close();
    }
}
