package Problems.Strings;
// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

import java.util.HashMap;

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.

// Example 1:

// Input: s = "III"
// Output: 3
// Explanation: III = 3.

// Example 2:

// Input: s = "LVIII"
// Output: 58
// Explanation: L = 50, V= 5, III = 3.

// Example 3:

// Input: s = "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

public class Roman_to_Integer_13 {
    public static void main(String[] args) {
        String input = "LVIII";
        // String input = "MCMXCIV";
        System.out.println(romanToInt(input));
    }

    public static int romanToInt(String s) {
        char[] roman = s.toCharArray();
        int result = 0;
        int j = 1;

        for (int i = 0; i < roman.length - 1; i++, j++) {
            int index = romanValues(roman[i]), nextIndex = romanValues(roman[j]);
            if (index >= nextIndex) {
                result += index;
            } else if (index < nextIndex) {
                result -= index;
            }
        }

        result += romanValues(roman[j - 1]);

        return result;
    }

    public static int romanValues(char c) {
        int value = 0;
        switch (c) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
            default:
                value = 0;
                break;
        }
        return value;
    }
}
