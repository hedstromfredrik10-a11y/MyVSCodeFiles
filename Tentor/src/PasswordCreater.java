import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PasswordCreater {

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "-_!?";
    private static List<Character> list = new ArrayList<>();
    private static Random gen = new Random();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose password length: ");
        int length = scan.nextInt();
        System.out.print("Choose minumum amount of lowercase letters: ");
        int lowerCase = scan.nextInt();
        System.out.print("Choose minumum amount of uppercase letters: ");
        int upperCase = scan.nextInt();
        System.out.print("Choose minumum amount of digits: ");
        int digit = scan.nextInt();
        System.out.print("Choose minumum amount of special characters: ");
        int special = scan.nextInt();
        System.out.println(passwordCreator(length, lowerCase, upperCase, digit, special));
        scan.close();
    }

    private static String passwordCreator(int length, int lowerCase, int upperCase, int digit, int special) {
        int totalStartingValues = lowerCase + upperCase + digit + special;
        if (totalStartingValues > length) {
            throw new IllegalArgumentException("Too many fucking chosen characters!!!!");
        }

        String[] values = { LOWERCASE, UPPERCASE, DIGITS, SPECIAL_CHARACTERS };
        if (length < 4) {
            throw new IllegalArgumentException("Password length to short");
        }

        for (int i = 0; i < lowerCase; i++) {
            addLowerCase();
        }

        for (int i = 0; i < upperCase; i++) {
            addUpperCase();
        }

        for (int i = 0; i < digit; i++) {
            addDigit();
        }

        for (int i = 0; i < special; i++) {
            addSpecialCharacter();
        }

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length - totalStartingValues; i++) {
            String selectedValue = values[gen.nextInt(4)];
            char c = selectedValue.charAt(gen.nextInt(selectedValue.length()));
            list.add(c);
        }

        Collections.shuffle(list);

        for (Character character : list) {
            password.append(character);
        }

        return password.toString();
    }

    private static void addLowerCase() {
        list.add(LOWERCASE.charAt(gen.nextInt(LOWERCASE.length())));
    }

    private static void addUpperCase() {
        list.add(UPPERCASE.charAt(gen.nextInt(UPPERCASE.length())));
    }

    private static void addDigit() {
        list.add(DIGITS.charAt(gen.nextInt(DIGITS.length())));
    }

    private static void addSpecialCharacter() {
        list.add(SPECIAL_CHARACTERS.charAt(gen.nextInt(SPECIAL_CHARACTERS.length())));
    }

}
