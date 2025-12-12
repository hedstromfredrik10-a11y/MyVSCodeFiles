package Problems.Strings;

// We define the usage of capitals in a word to be right when one of the following cases holds:

// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.

// Example 1:
// Input: word = "USA"
// Output: true

// Example 2:
// Input: word = "FlaG"
// Output: false

public class Detect_Capital {
    public static void main(String[] args) {
        // String word = "USA";
        String word = "Leetcode";
        System.out.println(detectCapitalUse(word));
    }

    public static boolean detectCapitalUse(String word) {
        boolean result = false;

        if (word.length() == 1) {
            return true;
        }
        char[] arr = word.toCharArray();
        if (Character.isUpperCase(arr[0])) {
            if (checkAllUpperCase(arr) == true && checkAllLowerCase(arr) == false) {
                result = true;
            }
        }

        if (Character.isUpperCase(arr[0])) {
            if (checkAllUpperCase(arr) == false && checkAllLowerCase(arr) == true) {
                result = true;
            }
        }

        if (Character.isLowerCase(arr[0])) {
            if (checkAllLowerCase(arr)) {
                result = true;
            }
        }

        return result;

    }

    public static boolean checkAllUpperCase(char[] arr) {
        boolean result = true;

        for (int i = 1; i < arr.length; i++) {
            if (Character.isLowerCase(arr[i])) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkAllLowerCase(char[] arr) {
        boolean result = true;

        for (int i = 1; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                result = false;
                break;
            }

        }
        return result;
    }

}
