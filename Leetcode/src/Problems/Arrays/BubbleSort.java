package Problems.Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[50];
        Random gen = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomNumber = gen.nextInt(500);
            arr[i] = randomNumber;
        }
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        // System.out.println(sumOddNumbers(100));

        // System.out.println(sum(3));

    }

    public static void bubbleSort(int[] arr) {
        int countSwaps = 0;

        for (int i = 0, j = 1; i < arr.length - 1; i++, j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                countSwaps++;
            }
        }

        if (countSwaps == 0) {
            return;
        }

        bubbleSort(arr);

    }

    public static int sumOddNumbers(int n) {

        if (n <= 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return sumOddNumbers(n - 1);
        }

        return n + sumOddNumbers(n - 2);

    }

    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        }

        return n + sum(n - 1);
    }
}
