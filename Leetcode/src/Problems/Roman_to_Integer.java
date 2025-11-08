package Problems;

// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000

public class Roman_to_Integer {
    public static void main(String[] args) {
        // String input = "VI";
        String input = "MCMXCIV";

        System.out.println(romanToInt(input));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        int cur = translate(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int next = translate(s.charAt(i));

            if (cur < next) {
                sum -= cur;
            } else {
                sum += cur;
            }
            cur = next;
        }

        sum += cur;
        return sum;
    }

    public static int translate(char a) {
        switch (a) {
            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;

            default:
                return 0;
        }

    }
}
