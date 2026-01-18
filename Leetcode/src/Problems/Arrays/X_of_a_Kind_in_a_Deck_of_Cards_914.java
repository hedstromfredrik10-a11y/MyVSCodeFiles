package Problems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

// You are given an integer array deck where deck[i] represents the number written on the ith card.

// Partition the cards into one or more groups such that:

// Each group has exactly x cards where x > 1, and
// All the cards in one group have the same integer written on them.
// Return true if such partition is possible, or false otherwise.

// Example 1:
// Input: deck = [1,2,3,4,4,3,2,1]
// Output: true
// Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].

// Example 2:
// Input: deck = [1,1,1,2,2,2,3,3]
// Output: false
// Explanation: No possible partition.

public class X_of_a_Kind_in_a_Deck_of_Cards_914 {
    public static void main(String[] args) {
        // int[] input = { 1, 2, 3, 4, 4, 3, 2, 1 };
        // int[] input = { 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 3, 3, 4, 5, 6 };
        // int[] input = { 1, 1, 1, 2, 2, 2, 3, 3 };
        int[] input = { 1, 1, 2, 2, 2, 2 };
        System.out.println(hasGroupsSizeX(input));
    }

    public static boolean hasGroupsSizeX(int[] deck) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < deck.length; i++) {
            map.put(deck[i], map.getOrDefault(deck[i], 0) + 1);
        }

        int ans = 0;

        for (int key : map.keySet()) {
            ans = gcd(ans, map.get(key));
        }

        return ans >= 2 ? true : false;

    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
