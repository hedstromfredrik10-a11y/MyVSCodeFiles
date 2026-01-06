package Problems.Recursion;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        Random gen = new Random();
        int[] array1 = new int[15];
        Hashtable<Integer, String> table = new Hashtable<>();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = gen.nextInt(50);
        }
        // System.out.println(Arrays.toString(array1));

        int element = array1[gen.nextInt(array1.length - 1)];

        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1) + "\n" + element);

        System.out.println(binarySearch(array1, element));

    }

    public static boolean binarySearch(int[] array1, int element) {
        int[] array2 = new int[array1.length / 2];
        int check = array1[array1.length / 2];

        if (array1.length == 1 && check != element) {
            return false;
        } else if (check > element) {
            array2 = Arrays.copyOfRange(array1, 0, array1.length / 2);
            return binarySearch(array2, element);
        } else if (check < element) {
            array2 = Arrays.copyOfRange(array1, array1.length / 2, array1.length);
            return binarySearch(array2, element);
        } else {
            return true;
        }

    }
}
