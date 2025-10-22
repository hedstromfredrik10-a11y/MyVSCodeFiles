package Tenta_2025_02_20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P6 {

    public static void main(String[] args) {
        double[] original = { 1.2, 2.5, 3.7, 4.4, 5.9, -1.3, -2.8, -2.8 };

        System.out.println("Original: " + Arrays.toString(original));
        int[] processed = arrayRounder(original);
        System.out.println("Rounded, Unique & Sorted: " + Arrays.toString(processed));
    }

    public static int[] arrayRounder(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[0]; // tom array om null eller tom
        }

        Set<Integer> uniqueNumbers = new HashSet<>();

        for (double num : numbers) {
            int rounded;
            if (num > 0) {
                rounded = (int) Math.ceil(num); // positiva -> tak
            } else {
                rounded = (int) Math.floor(num); // negativa -> golv
            }
            uniqueNumbers.add(rounded);
        }

        // Omvandla till array och sortera
        int[] result = uniqueNumbers.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(result);

        return result;
    }

}
