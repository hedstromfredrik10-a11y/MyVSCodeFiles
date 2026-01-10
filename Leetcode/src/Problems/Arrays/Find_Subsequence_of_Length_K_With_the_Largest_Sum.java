package Problems.Arrays;

import java.util.Arrays;

public class Find_Subsequence_of_Length_K_With_the_Largest_Sum {
    public static void main(String[] args) {
        // int[] arr = { 2, 1, 3, 3 };
        // int[] arr = { 63, -74, 61, -17, -55, -59, -10, 2, -60, -65 };
        int[] arr = { 18, 3, 19, -8, 30, 22, -35, 11, 16, 18, -21, 32, -7, -6, 38, 25, -21, -1, 26, -8, -37, -39, -34,
                6, -36, -3, 26, -32, 22, -20, 35, -35, -30, -8, 11, 7, -23, -9, -22, 1, 33, -6, 12, 2, 27, -27, 28, -12,
                21, 12, 16, 21, 33 };
        // int[] arr = { 50, -75 };
        int k = 50;
        System.out.println(Arrays.toString(maxSubsequence(arr, k)));
    }

    public static int[] maxSubsequence(int[] nums, int k) {
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
                }
            }
            if (idx == k) {
                break;
            }
        }

        return doneArray;
    }
}