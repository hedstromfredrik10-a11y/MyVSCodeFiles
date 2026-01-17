package Problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Tenta_mostVowels {
    public static void main(String[] args) {
        String a = "Hej världen";
        System.out.println(countVowels(a));

        List<Integer> list = new LinkedList<>();

    }

    public static int countVowels(String s) {
        int count = 0;

        String[] vowels = { "a", "o", "u", "å", "e", "i", "y", "ä", "ö" };

        for (int i = 0; i < s.length(); i++) {
            for (int x = 0; x < vowels.length; x++) {
                if (Character.toString(s.charAt(i)).equalsIgnoreCase(vowels[x])) {
                    count++;
                }
            }
        }

        return count;
    }

    public static String mostVowelWord(String a, String b) {
        String result = "";

        if (countVowels(a) < countVowels(b)) {
            result = b;
        } else if (countVowels(a) > countVowels(b)) {
            result = a;
        } else {
            result = a;
        }

        return result;
    }

}
