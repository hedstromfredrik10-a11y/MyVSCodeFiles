package Data_Structures;

import java.util.Scanner;

public class Java_2D_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];

        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < 6; x++) {
                arr[i][x] = scan.nextInt();
            }
        }

        int value = Integer.MIN_VALUE;

        for (int i = 0; i <= 3; i++) {
            for (int x = 0; x <= 3; x++) {
                int sum = 0;

                sum += arr[i][x];
                sum += arr[i][x + 1];
                sum += arr[i][x + 2];
                sum += arr[i + 1][x + 1];
                sum += arr[i + 2][x];
                sum += arr[i + 2][x + 1];
                sum += arr[i + 2][x + 2];

                if (sum > value) {
                    value = sum;
                }
            }
        }

        System.out.println(value);

        scan.close();
    }
}