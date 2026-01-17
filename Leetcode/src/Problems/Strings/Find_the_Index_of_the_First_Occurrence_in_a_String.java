package Problems.Strings;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String neddle = "tc";

        System.out.println(strStr(haystack, neddle));

    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
