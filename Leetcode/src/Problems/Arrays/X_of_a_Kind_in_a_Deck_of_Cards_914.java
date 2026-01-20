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
        Arrays.sort(deck);
        List<Integer> partitionSizes = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        if (deck.length == 1) {
            return false;
        }

        partitionSizes.add(IntStream.of(deck).filter(n -> n == deck[0]).toArray().length);
        map.put(deck[0], IntStream.of(deck).filter(n -> n == deck[0]).toArray().length);

        for (int i = 0, j = 1; i < deck.length - 1; i++, j++) {
            if (deck[i] != deck[j]) {
                int temp = deck[j];
                int[] temporaryArray = IntStream.of(deck).filter(n -> n == temp).toArray();
                partitionSizes.add(temporaryArray.length);
                map.put(deck[j], temporaryArray.length);
            }
        }

        int sizeZero = partitionSizes.get(0);

        Collections.sort(partitionSizes);

        if (!partitionSizes.stream().allMatch(n -> n == partitionSizes.get(0))) {
            for (int i = 0; i < deck.length; i++) {
                if () {

                }
            }
        }
        return true;
    }
}
