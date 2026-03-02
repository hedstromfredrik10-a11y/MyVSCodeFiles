// Skriv en metod
// som tar emot ett heltal som bestämmer längden av ett genererat
// slumpmässigt lösenord. Lösenordet skall innehålla minst en av:
// Stor bokstav från engelska alfabetet
// Liten bokstav från engelska alfabetet
// En entalssiffra
// Ett specialtecken.
// Felkontroll på att längden alltså inte kan vara mindre än 4. Om så är
// fallet kastas IllegalArgumentException.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordCreater {

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "-_!?";

    public static void main(String[] args) {
        int length = 10;
        System.out.println(passwordCreator(length));
    }

    public static String passwordCreator(int length) {
        String[] values = { LOWERCASE, UPPERCASE, DIGITS, SPECIAL_CHARACTERS };
        List<Character> result = new ArrayList<>();
        if (length < 4) {
            throw new IllegalArgumentException("Password length to short");
        }
        StringBuilder password = new StringBuilder();
        Random gen = new Random();

        char lowercase = LOWERCASE.charAt(gen.nextInt(LOWERCASE.length() - 1)),
                uppercase = UPPERCASE.charAt(gen.nextInt(UPPERCASE.length() - 1)),
                digits = DIGITS.charAt(gen.nextInt(DIGITS.length() - 1)),
                specialCharacter = SPECIAL_CHARACTERS.charAt(gen.nextInt(SPECIAL_CHARACTERS.length() - 1));

        password.append(lowercase).append(uppercase).append(digits).append(specialCharacter);

        for (int i = 0; i < length - 4; i++) {
            String selectedValue = values[gen.nextInt(4)];
            char c = selectedValue.charAt(gen.nextInt(selectedValue.length()));
            password.append(c);
        }

        // System.out.println(password.toString());

        return password.toString();
    }

}
