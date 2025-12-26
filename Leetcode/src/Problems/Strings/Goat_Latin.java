package Problems.Strings;

// You are given a string sentence that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.

// We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:

// If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to the end of the word.
// For example, the word "apple" becomes "applema".

// If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add "ma".
// For example, the word "goat" becomes "oatgma".
// Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
// For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.
// Return the final sentence representing the conversion from sentence to Goat Latin.

// Example 1:
// Input: sentence = "I speak Goat Latin"
// Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"

// Example 2:
// Input: sentence = "The quick brown fox jumped over the lazy dog"
// Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"

public class Goat_Latin {
    public static void main(String[] args) {
        // String input = "I speak Goat Latin";
        String input = "The quick brown fox jumped over the lazy dog";
        System.out.println(toGoatLatin(input));
    }

    public static String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();

        String[] vowels = { "a", "e", "i", "o", "u" };
        String[] consonant = {
                "b", "c", "d", "f", "g", "h", "j", "k", "l", "m",
                "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"
        };
        String[] arr = sentence.split("\\s+");
        String a = "a";

        if (sentence.isBlank()) {
            return "";
        }

        for (String string : arr) {

            for (int i = 0; i < vowels.length; i++) {
                if (Character.toString(string.charAt(0)).equalsIgnoreCase(vowels[i])) {
                    sb.append(string).append("ma").append(a).append(" ");
                }
            }

            for (int j = 0; j < consonant.length; j++) {
                if (Character.toString(string.charAt(0)).equalsIgnoreCase(consonant[j])) {
                    sb.append(string.substring(1, string.length())).append(string.substring(0, 1)).append("ma")
                            .append(a).append(" ");
                }
            }

            a += "a";
        }

        return sb.toString().trim();
    }
}
