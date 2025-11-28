package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] input = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        // int[] input = { 1, 1, 2 };

        System.out.print(removeDuplicates(input));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int check = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[check] = nums[i];
                check++;
            }
        }

        return check;

    }
}
