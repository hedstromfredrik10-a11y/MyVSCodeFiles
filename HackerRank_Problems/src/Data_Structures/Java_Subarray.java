package Data_Structures;

import java.util.Scanner;

public class Java_Subarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];

        String input = scan.nextLine();
        String[] strArr = input.split("\\s+");

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
            if (arr[i] < 0) {
                counter++;
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i];
            for (int x = (i + 1); x < arr.length; x++) {
                sum += arr[x];
                if (sum < 0) {
                    counter++;
                }
            }

        }

        System.out.println(counter);
        scan.close();
    }

}
