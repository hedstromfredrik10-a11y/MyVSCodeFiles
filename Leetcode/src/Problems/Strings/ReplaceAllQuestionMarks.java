package Problems.Strings;

import java.util.Random;

// Given a string s containing only lowercase English letters and the '?' character, convert all the '?' characters into lowercase letters such that the final string does not contain any consecutive repeating characters. You cannot modify the non '?' characters.

// It is guaranteed that there are no consecutive repeating characters in the given string except for '?'.

// Return the final string after all the conversions (possibly zero) have been made. If there is more than one solution, return any of them. It can be shown that an answer is always possible with the given constraints.

// Example 1:
// Input: s = "?zs"
// Output: "azs"
// Explanation: There are 25 solutions for this problem. From "azs" to "yzs", all are valid. Only "z" is an invalid modification as the string will consist of consecutive repeating characters in "zzs".

// Example 2:
// Input: s = "ubv?w"
// Output: "ubvaw"
// Explanation: There are 24 solutions for this problem. Only "v" and "w" are invalid modifications as the strings will consist of consecutive repeating characters in "ubvvw" and "ubvww".

public class ReplaceAllQuestionMarks {
    public static void main(String[] args) {
        String s = "?asda?aosdm?amd?";
        // String s = "ubvsas?";
        System.out.println(modifyString(s));
    }

    public static String modifyString(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                for (char c = 'a'; c <= 'c'; c++) {
                    if ((i > 0 && arr[i - 1] == c) || (i < arr.length - 1 && arr[i + 1] == c)) {
                        continue;
                    }
                    arr[i] = c;
                    break;
                }
            }
        }

        return new String(arr);
    }

    // public static void addRandomLetter(char[] arr, int index) {
    //     char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
    //             's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

    //     Random gen = new Random();
    //     arr[index] = letters[gen.nextInt(letters.length)];
    //     char left = ' ';
    //     char right = ' ';

    //     if (arr.length != 1) {
    //         if (index == 0) {
    //             right = arr[index + 1];
    //         } else if (index == arr.length - 1) {
    //             left = arr[index - 1];
    //         } else {
    //             left = arr[index - 1];
    //             right = arr[index + 1];
    //         }
    //     }

    //     if (Character.toString(arr[index]).equals(Character.toString(left))
    //             || Character.toString(arr[index]).equals(Character.toString(right))) {
    //         addRandomLetter(arr, index);
    //     }
    // }
}
