package Problems;

import java.util.Arrays;

// iven a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Example 1:
// Input: nums = [2,2,1]
// Output: 1

// Example 2:
// Input: nums = [4,1,2,1,2]
// Output: 4

// Example 3:
// Input: nums = [1]
// Output: 1

public class Single_Number {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2, };
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length);
        int element = 0;
        for (int i = 0; i < nums.length - 3; i += 2) {
            if (nums[i] != nums[i + 1]) {
                if (checkAnomaly(Integer.valueOf(nums[i]), nums)) {
                    element = nums[i];
                    break;
                } else if (checkAnomaly(Integer.valueOf(nums[i + 1]), nums)) {
                    element = nums[i + 1];
                    break;
                }
            }
        }
        return element;
    }

    public static boolean checkAnomaly(int input, int[] nums) {
        boolean check = false;
        for (int i = 0; i < nums.length; i++) {
            if (input == nums[i]) {
                check = false;
            } else {
                check = true;
            }
        }
        return check;
    }
}
