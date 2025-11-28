package Problems;

import java.util.Arrays;

public class Tenta_2025_08_18_P6 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 5 }, { 1, 3 }, { 1, 3, 5, 6 } };
        
        System.out.println(Arrays.toString(rowProduct(arr)));

    }

    public static int[] rowProduct(int[][] input) {
        int[] result = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            int h = 1;
            for (int x = 0; x < input[i].length; x++) {
                h *= input[i][x];
                result[i] = h;
            }
        }

        return result;
    }
}