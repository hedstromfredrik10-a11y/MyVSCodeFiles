package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Merge_sorted_array {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = 0;
        for (int i = n; i < nums1.length; i++) {
            nums1[i] = nums2[x++];
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer integer : nums1) {
            list.add(integer);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            nums1[i] = list.get(i);
        }
        System.out.println(Arrays.toString(nums1));
    }
}
