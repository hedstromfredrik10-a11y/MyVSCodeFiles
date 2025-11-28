package Problems;

public class Tenta_mostVowels {
    public static void main(String[] args) {
        String a = "Hej världen";
        String b = "Måsvinge";

        System.out.println(mostVowelWord(a, b));

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

    public static int countVowels(String s) {
        int count = 0;

        char[] vowels = { 'a', 'o', 'u', 'å', 'e', 'i', 'y', 'ä', 'ö' };

        for (int i = 0; i < s.length(); i++) {
            for (int x = 0; x < vowels.length; x++) {
                if (s.charAt(i) == vowels[x]) {
                    count++;;
                }
            }
        }

        return count;
    }
}
