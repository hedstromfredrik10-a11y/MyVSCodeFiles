package Problems;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String neddle = "etco";

        System.out.println(strStr(haystack, neddle));

    }

    public static int strStr(String haystack, String needle) {
        int index = 0;

        for (int i = 0; i < haystack.length(); i++) {
            try {
                if (needle.equals(haystack.substring(i, needle.length() + i))) {
                    index = i;
                    i = haystack.length();
                } else {
                    index = -1;
                }
            } catch (Exception e) {
                index = -1;
            }
        }
        return index;
    }
}
