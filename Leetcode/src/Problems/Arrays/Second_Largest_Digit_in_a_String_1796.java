package Problems.Arrays;
// Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

// An alphanumeric string is a string consisting of lowercase English letters and digits.

// Example 1:

// Input: s = "dfa12321afd"
// Output: 2
// Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
// Example 2:

// Input: s = "abc1111"
// Output: -1
// Explanation: The digits that appear in s are [1]. There is no second largest digit. 

public class Second_Largest_Digit_in_a_String_1796 {
    public static void main(String[] args) {
        String input = "dfa12321afd";
        System.out.println(secondHighest(input));
    }

    public static int secondHighest(String s) {
        char[] arr = s.toCharArray();
        List<Integer> list = new ArrayList<>();

        for (char c : arr) {
            if (Character.isDigit(c)) {
                list.add(c - '0');
            }
        }

        Collections.sort(list);

        list.removeIf(n -> n == list.get(list.size() - 1));

        return list.size() == 0 ? -1 : list.get(list.size() - 1);
    }
}
