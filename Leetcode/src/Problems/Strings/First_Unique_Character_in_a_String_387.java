package Problems.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/* Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1 */

public class First_Unique_Character_in_a_String_387 {
    public static void main(String[] args) {
        // String inputString = "eettccooddel";
        // String inputString = "aabb";
        String inputString = "loveleetcode";
        System.out.println(firstUniqChar(inputString));
    }

    public static int firstUniqChar(String s) {
        int index = 0;
        boolean findIndex = false;
        List<Character> list = new ArrayList<>(s.chars().mapToObj(c -> (char) c).toList());

        while (true) {
            char a = list.get(index);
            Object[] array = list.stream().filter(c -> c == a).toArray();
            if (array.length == 1) {
                findIndex = true;
                break;
            }

            index++;
            if (index >= list.size() && findIndex == false) {
                break;
            }
        }

        return findIndex == true ? index : -1;

    }

    // public static int firstUniqChar(String s) {
    // char st[] = s.toCharArray();
    // HashMap<Character, Integer> map = new HashMap<>();
    // for (char c : st) {
    // map.put(c, map.getOrDefault(c, 0) + 1);
    // }
    // for (int i = 0; i < st.length; i++) {
    // if (map.get(st[i]) == 1) {
    // return i;
    // }
    // }
    // return -1;
    // }
}
