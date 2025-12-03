package Problems;

import java.math.BigInteger;

// Given two binary strings a and b, return their sum as a binary string.

// Example 1:
// Input: a = "11", b = "1"
// Output: "100"

// Example 2:
// Input: a = "1010", b = "1011"
// Output: "10101"

public class Add_Binary {
    public static void main(String[] args) {
        // String a = "11";
        // String b = "1";

        // String a = "1010";
        // String b = "1011";
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        System.out.println(addBianry(a, b));
    }

    public static String addBianry(String a, String b) {
        BigInteger bigA = new BigInteger(a, 2);
        BigInteger bigB = new BigInteger(b, 2);

        BigInteger sum = bigA.add(bigB);

        return sum.toString(2);
    }

}
