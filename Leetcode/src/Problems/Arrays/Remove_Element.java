package Problems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Element {
    public static void main(String[] args) {
        // int[] nums = { 3, 2, 2, 3 };
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;

        System.out.println(removeElement(nums, val));

    }

    public static int removeElement(int[] nums, int val) {
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : nums) {
            list.add(i);
        }

        list.removeIf(n -> n == val);

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
            result++;
        }
        return result;

    }
}
