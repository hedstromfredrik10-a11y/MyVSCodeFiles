package Problems.Strings;

// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.

// Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.

public class Length_of_Last_Word {
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] arr = s.split("\\s+");

        String lastWord = arr[arr.length - 1];

        char[] arr2 = lastWord.toCharArray();
        return arr2.length;
    }
}
