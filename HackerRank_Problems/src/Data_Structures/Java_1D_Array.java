package Data_Structures;

import java.util.Scanner;

public class Java_1D_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.nextLine();

        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for (int x : arr) {
            System.out.println(x);
        }

        scan.close();
    }
}
