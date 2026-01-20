package Problems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Separate_the_Digits_in_an_Array_2553 {
    public static void main(String[] args) {
        int[] nums = { 13, 25, 83, 77 };
        System.out.println(Arrays.toString(seperateDigits(nums)));

    }

    public static int[] seperateDigits(int[] nums) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            String s = Integer.toString(nums[i]);
            char[] arr = s.toCharArray();
            for (int j = 0; j < arr.length; j++) {
                answer.add(arr[j] - '0');
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
