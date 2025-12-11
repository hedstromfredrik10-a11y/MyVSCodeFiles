package Problems.Strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

// There are n rings and each ring is either red, green, or blue. The rings are distributed across ten rods labeled from 0 to 9.

// You are given a string rings of length 2n that describes the n rings that are placed onto the rods. Every two characters in rings forms a color-position pair that is used to describe each ring where:

// The first character of the ith pair denotes the ith ring's color ('R', 'G', 'B').
// The second character of the ith pair denotes the rod that the ith ring is placed on ('0' to '9').
// For example, "R3G2B1" describes n == 3 rings: a red ring placed onto the rod labeled 3, a green ring placed onto the rod labeled 2, and a blue ring placed onto the rod labeled 1.

// Return the number of rods that have all three colors of rings on them.

// Input: rings = "B0B6G0R6R0R6G9"
// Output: 1
// Explanation: 
// - The rod labeled 0 holds 3 rings with all colors: red, green, and blue.
// - The rod labeled 6 holds 3 rings, but it only has red and blue.
// - The rod labeled 9 holds only a green ring.
// Thus, the number of rods with all three colors is 1.

public class Rings_and_Rods {
    public static void main(String[] args) {
        // String rings = "B0B6G0R6R0R6G9";
        String rings = "B0R0G0R9R0B0G0";
        // String rings = "G4";

        System.out.println(countPoints(rings));

    }

    public static int countPoints(String rings) {
        int result = 0;
        char[] arr = rings.toCharArray();
        int[] rods = new int[rings.length() / 2];
        char[] colors = new char[rings.length() / 2];
        ArrayList<Integer> indexList = new ArrayList<>();
        HashMap<Integer, String> rodsWithRings = new HashMap<Integer, String>();

        int start = 0;
        for (int i = 1, j = 0; start < arr.length / 2; i = i + 2, j = j + 2) {
            rods[start] = Integer.parseInt(String.valueOf(arr[i]));
            colors[start] = arr[j];
            start++;
        }

        for (int i = 0; i < rods.length; i++) {
            indexList.add(i);
        }

        indexList.sort(Comparator.comparingInt(i -> rods[i]));

        int[] sortedNumbers = new int[rods.length];
        char[] sortedLetters = new char[colors.length];

        for (int i = 0; i < indexList.size(); i++) {
            int idx = indexList.get(i);
            sortedNumbers[i] = rods[idx];
            sortedLetters[i] = colors[idx];
        }

        String s = "";

        for (int i = 0; i < sortedNumbers.length; i++) {
            s += sortedLetters[i];
            rodsWithRings.put(sortedNumbers[i], s);
            if (i != sortedNumbers.length - 1) {
                if (sortedNumbers[i] != sortedNumbers[i + 1]) {
                    s = "";
                }
            }
        }

        List<Integer> rodsNbrs = new ArrayList<>();

        for (Integer integer : sortedNumbers) {
            rodsNbrs.add(integer);
        }

        for (int i = 0; i < rodsNbrs.size(); i++) {
            for (int x = i + 1; x < rodsNbrs.size(); x++) {
                if (rodsNbrs.get(i) == rodsNbrs.get(x)) {
                    rodsNbrs.set(x, null);
                }
            }
        }

        rodsNbrs.removeIf(n -> n == null);

        for (Integer integer : rodsNbrs) {
            if (rodsWithRings.get(integer).contains("R") && rodsWithRings.get(integer).contains("G")
                    && rodsWithRings.get(integer).contains("B")) {
                result++;
            }
        }

        System.out.println(rodsWithRings);

        return result;

    }
}
