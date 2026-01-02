package Problems.Arrays;

import java.util.Arrays;
import java.util.Queue;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 9, 4, 2, 7, 8, 6, 4, 3, 6, 5, 19, 6, 80, 34, 2, 6 };
        // int[] arr = { 6, 1, 8, 3, 7 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(sumOddNumbers(100));

        System.out.println(sum(3));

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
