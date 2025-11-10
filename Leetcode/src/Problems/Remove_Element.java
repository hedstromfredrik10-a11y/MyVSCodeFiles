package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Remove_Element {
    public static void main(String[] args) {
        // int[] nums = { 3, 2, 2, 3 };
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;

        System.out.println(removeElement(nums, val));

    }

    public static int removeElement(int[] nums, int val) {
        int result = 0;
        int counter = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : nums) {
            list.add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.get(i) == val) {
                list.set(i, null);
            } else {
                counter++;
            }
        }

        int size = list.size();

        

        System.out.println(list.toString());

        System.out.println(Arrays.toString(nums));
        result = counter;

        return result;

    }
}
