package Problems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Sum_Multiples {
    public static void main(String[] args) {
        System.out.println(sumOfMultiples(7));

    }

    public static int sumOfMultiples(int n) {
        int numsToSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                numsToSum += i;
            }
        }
        return numsToSum;
    }
}
