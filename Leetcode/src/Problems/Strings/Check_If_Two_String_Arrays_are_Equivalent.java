package Problems.Strings;

// Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
// A string is represented by an array if the array elements concatenated in order forms the string.

// Example 1:
// Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
// Output: true
// Explanation:
// word1 represents string "ab" + "c" -> "abc"
// word2 represents string "a" + "bc" -> "abc"
// The strings are the same, so return true.

// Example 2:
// Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
// Output: false

// Example 3:
// Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
// Output: true

public class Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
        String[] a = { "ab", "c" };
        String[] b = { "a", "bc" };

        System.out.println(arrayStringsAreEqual(a, b));

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean result = false;
        String s = createString(word1);
        String s2 = createString(word2);

        if (s.equals(s2)) {
            result = true;
        }

        return result;
    }

    public static String createString(String[] s) {
        StringBuilder sb = new StringBuilder();

        for (String string : s) {
            sb.append(string);
        }

        return sb.toString();
    }
}
