package Problems.Arrays;

import java.util.Collections;
import java.util.LinkedList;

public class Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        int[] arr1 = { 2, 1, 4 };
        int[] arr2 = { 1, 4, 3 };

        for (int i : arr1) {
            list1.add(i);
        }
        for (int i : arr2) {
            list2.add(i);
        }
        System.out.println(mergeTwoLists(list1, list2).toString());

    }

    public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> result = new LinkedList<>();

        for (Integer integer : list1) {
            result.add(integer);
        }

        for (Integer integer : list2) {
            result.add(integer);
        }

        Collections.sort(result);

        return result;

    }
}
