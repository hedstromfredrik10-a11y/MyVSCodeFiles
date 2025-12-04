package Problems.Arrays;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] input = { "flower", "flow", "flight" };

        System.out.println(longestCommonPrefix(input));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].equals("")) {
            return "";
        } else {
            boolean flag = true;
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < strs[0].length(); i++) {
                String check = String.valueOf(strs[0].charAt(i));
                for (int x = 0; x < strs.length; x++) {
                    try {
                        if (check.equals(String.valueOf(strs[x].charAt(i)))) {
                            flag = true;
                        } else {
                            flag = false;
                            x = strs.length;
                            i = strs[0].length();
                        }
                    } catch (Exception e) {
                        x = strs.length;
                        flag = false;
                    }
                }
                if (flag) {
                    s.append(check);
                }
            }
            if (s.length() > 0) {
                return s.toString();
            } else {
                return "";
            }
        }

    }
}
