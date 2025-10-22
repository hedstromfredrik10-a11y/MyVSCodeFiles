package BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class Java_Primality_Test_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger n = scan.nextBigInteger();
        
        if (n.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        scan.close();
    }
}
