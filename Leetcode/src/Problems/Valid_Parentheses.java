package Problems;

import java.util.Arrays;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String input = "()[]{}";

        System.out.println(isValid(input));
        
    }

    public static boolean isValid(String s) {
        boolean flag = true;
        char[] arr = s.toCharArray();
        if (s.length() % 2 == 1) {
            flag = false;
        } else {
            for (int i = 0; i < s.length(); i++) {

            }

        }

        return flag;
    }
}
