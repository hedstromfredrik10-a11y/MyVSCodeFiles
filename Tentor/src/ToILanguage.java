import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.stream.IntStream;

public class ToILanguage {

    public static void main(String[] args) {
        // String input = "Jag gillar att programmera";
        String input = "Intressanta meningar blir det";
        System.out.println(toILanguage(input));
    }

    public static String toILanguage(String input) {
        String[] vowels = { "a", "o", "u", "å", "e", "i", "y", "ä", "ö" };

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (Character.toString(input.charAt(i)).equalsIgnoreCase(vowels[j])) {
                    if (!Character.isUpperCase(input.charAt(i))) {
                        input = input.replace(input.charAt(i), 'i');
                    } else {
                        input = input.replace(input.charAt(i), 'I');
                    }
                }
            }
        }

        return input;

    }

}
