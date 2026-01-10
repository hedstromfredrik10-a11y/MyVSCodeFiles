package Problems.Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // int[] arr = new int[20];
        // Random gen = new Random();

        // for (int i = 0; i < arr.length; i++) {
        // int randomNumber = gen.nextInt(200);
        // arr[i] = randomNumber;
        // }
        int[] arr = { 9, 4, 5, 3, 7, 6, 2, 5 };
        printReverseArray(arr, arr.length - 1);
        // System.out.println(Arrays.toString(arr));

        // System.out.println(Arrays.toString(bubbleSort(arr)));

        // System.out.println(sumOddNumbers(10));

        // System.out.println(sum(4));
        // System.out.println(Arrays.toString(arr));
        // insertionSort2(arr);
        // bubbleSort2(arr);
        // System.out.println(Arrays.toString(arr));

        System.out.println(sumOddNumbers(10));

        // System.out.println(sum(3));

    }

    public static void printReverseArray(int[] arr, int index) {
        if (index < 0)
            return;
        System.out.println(arr[index]);
        printReverseArray(arr, index - 1);
    }

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > currentValue) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentValue;
        }
    }

    public static void insertionSort2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (j - 1 < 0) {
                    break;
                }

                if (arr[j - 1] > arr[j]) {
                    int element = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = element;
                }
            }
        }
    }

    public static int[] bubbleSort(int[] arr) {
        int countSwaps = 0;

        for (int i = 0, j = 1; i < arr.length - 1; i++, j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                countSwaps++;
            }
        }

        return countSwaps == 0 ? arr : bubbleSort(arr);
    }

    public static void bubbleSort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int sumOddNumbers(int n) {
        return n <= 0 ? 0 : n % 2 == 0 ? sumOddNumbers(n - 1) : n + sumOddNumbers(n - 2);
    }

    public static int sum(int n) {
        return n <= 0 ? 0 : n + sum(n - 1);
    }
}
