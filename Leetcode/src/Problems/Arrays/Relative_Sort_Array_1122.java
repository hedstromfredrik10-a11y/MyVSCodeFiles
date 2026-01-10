package Problems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all
 * elements in arr2 are also in arr1.
 * 
 * Sort the elements of arr1 such that the relative ordering of items in arr1
 * are the same as in arr2. Elements that do not appear in arr2 should be placed
 * at the end of arr1 in ascending order.
 * 
 * Example 1:
 * 
 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * Output: [2,2,2,1,4,3,3,9,6,7,19]
 * 
 * Example 2:
 * 
 * Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
 * Output: [22,28,8,6,17,44]
 * 
 */

public class Relative_Sort_Array_1122 {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 }, arr2 = { 2, 1, 4, 3, 9, 6 };
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> inList = new ArrayList<>();
        List<Integer> notInList = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            int data = arr1[i];
            if (IntStream.of(arr2).anyMatch(num -> num == data)) {
                inList.add(data);
            } else {
                notInList.addAll(notInList);
            }
        }

        int[] result = new int[arr1.length];
        int idx = 0;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    result[idx] = arr1[j];
                    idx++;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            int element = arr1[i];
            boolean findElement = IntStream.of(arr2).anyMatch(num -> num == element);
            if (findElement == false) {
                result[idx] = element;
                idx++;
            }
        }

        return result;
    }
}
