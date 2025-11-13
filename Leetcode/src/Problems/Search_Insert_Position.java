package Problems;

import java.util.ArrayList;
import java.util.Collections;

// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [1,3,5,6], target = 5
// Output: 2

// Example 2:
// Input: nums = [1,3,5,6], target = 2
// Output: 1

// Example 3:
// Input: nums = [1,3,5,6], target = 7
// Output: 4

public class Search_Insert_Position {
    public static void main(String[] args) {
        // int[] nums = { 3, 2, 2, 3 };
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;

        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int result = 0;
        boolean found = false;

        ArrayList<Integer> list = new ArrayList<>();

        for (Integer integer : nums) {
            list.add(integer);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result = i;
                found = true;
            } else if (i == (nums.length - 1) && found == false) {
                list.add(target);
            }
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                result = i;
            }
        }

        return result;
    }
}
