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

        // ------------------------------------------------------------

        // List<Integer> list = new ArrayList<>();
        // List<Integer> finalList = new ArrayList<>();

        // for (int i : nums) {
        //     list.add(i);
        // }

        // for (int i = 0; i < list.size(); i++) {
        //     for (int x = (i + 1); x < list.size(); x++) {
        //         if (list.get(i) == list.get(x)) {
        //             list.remove(i);
        //             list.add(i, null);
        //         }
        //     }
        // }
        // int counter = 0;
        // for (int i = 0; i < list.size(); i++) {
        //     if (list.get(i) == null) {
        //         counter++;
        //     }
        // }

        // for (Integer integer : list) {
        //     if (integer != null) {
        //         finalList.add(integer);
        //     }
        // }

        // int result = list.size() - counter;

        // return result;

    }
}
