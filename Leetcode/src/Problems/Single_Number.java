package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        // int[] arr = { 2, 1, 3, 1, 3 };
        // int[] arr = { 2, 2, 1 };
        // int[] arr = { 1, 1, 2, 3, 3 };
        int[] arr = { -336, 513, -560, -481, -174, 101, -997, 40, -527, -784, -283, -336, 513, -560, -481, -174, 101,
                -997, 40, -527, -784, -283, 354 };

        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int element = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int integer : nums) {
            list.add(integer);
        }

        while (true) {
            if (list.size() == 1) {
                element = list.getFirst();
                break;
            } else {
                temp.add(list.get(0));
                temp.add(list.get(1));
            }

            if (temp.get(0).compareTo(temp.get(1)) != 0) {
                list.removeIf(n -> n == list.get(2));
            } else {
                temp.clear();
                list.remove(0);
                list.remove(0);
            }

        }

        return element;
    }
}
