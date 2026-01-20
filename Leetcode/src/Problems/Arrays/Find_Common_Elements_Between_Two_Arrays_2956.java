package Problems.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

// Example 1:

// Input: nums1 = [2,3,2], nums2 = [1,2]

// Output: [2,1]

// Input: nums1 = [4,3,2,3,1], nums2 = [2,2,5,2,3,6]

// Output: [3,4]

// Explanation:

// The elements at indices 1, 2, and 3 in nums1 exist in nums2 as well. So answer1 is 3.

// The elements at indices 0, 1, 3, and 4 in nums2 exist in nums1. So answer2 is 4.

public class Find_Common_Elements_Between_Two_Arrays_2956 {
    public static void main(String[] args) {
        int[] input = { 2, 3, 2 };
        int[] input2 = { 1, 2 };

        System.out.println(Arrays.toString(findIntersectionValues(input, input2)));
    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] result = new int[2];
        result[0] = answers(nums1, nums2);
        result[1] = answers(nums2, nums1);
        return result;
    }

    public static int answers(int[] arr1, int[] arr2) {
        int answer = 0;
        for (int i = 0; i < arr1.length; i++) {
            int find = arr1[i];
            if (IntStream.of(arr2).anyMatch(n -> n == find)) {
                answer++;
            }
        }
        return answer;
    }
}
