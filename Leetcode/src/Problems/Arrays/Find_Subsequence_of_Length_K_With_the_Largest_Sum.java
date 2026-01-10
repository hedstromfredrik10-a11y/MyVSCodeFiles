package Problems.Arrays;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.PriorityQueue;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Find_Subsequence_of_Length_K_With_the_Largest_Sum {
    public static void main(String[] args) {
        // int[] arr = { 2, 1, 3, 3 };
        // int[] arr = { 63, -74, 61, -17, -55, -59, -10, 2, -60, -65 };
        // int[] arr = { 18, 3, 19, -8, 30, 22, -35, 11, 16, 18, -21, 32, -7, -6, 38,
        // 25, -21, -1, 26, -8, -37, -39, -34,
        // 6, -36, -3, 26, -32, 22, -20, 35, -35, -30, -8, 11, 7, -23, -9, -22, 1, 33,
        // -6, 12, 2, 27, -27, 28, -12,
        // 21, 12, 16, 21, 33 };
        int[] arr = { -16, -13, 8, 16, 35, -17, 30, -8, 34, -2, -29, -35, 15, 13, -30, -34, 6, 15, 28, -23, 34, 28, -24,
                15, -17, 10, 31, 32, -3, -36, 19, 31, -5, -21, -33, -18, -23, -37, -15, 12, -28, -40, 1, 38, 38, -38,
                33, -35, -28, -40, 4, -15, -29, -33, -18, -9, -29, 20, 1, 36, -8, 23, -34, 16, -7, 13, 39, 38, 7, -7,
                -10, 30, 9, 26, 27, -37, -18, -25, 14, -36, 23, 28, -15, 35, -9, 1 };
        int k = 8;
        System.out.println(Arrays.toString(maxSubsequence2(arr, k)));
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        if (nums.length == k) {
            return nums;
        }

        int[] cloneArray = nums.clone();
        Arrays.sort(cloneArray);
        int[] result = new int[k];

        for (int i = 0, j = cloneArray.length - 1; i < k; i++, j--) {
            result[i] = cloneArray[j];
        }

        int[] doneArray = new int[k];
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (nums[i] == result[j]) {
                    doneArray[idx] = result[j];
                    idx++;
                    break;
                }
            }
            if (idx == k) {
                break;
            }
        }

        return doneArray;
    }

    public static int[] maxSubsequence2(int[] nums, int k) {
        PriorityQueue<Integer> indexes = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            indexes.add(i);
            if (indexes.size() > k) {
                indexes.poll();
            }
        }

        return indexes.stream().sorted().mapToInt(i -> nums[i]).toArray();

    }
}