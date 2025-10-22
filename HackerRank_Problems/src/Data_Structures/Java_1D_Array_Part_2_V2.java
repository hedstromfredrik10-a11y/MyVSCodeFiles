package Data_Structures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Java_1D_Array_Part_2_V2 {
    private static boolean check(int i, int leap, int[] arr) {
        if (i < 0 || arr[i] == 1)
            return false;
        if (i + leap >= arr.length || i == arr.length - 1)
            return true;
        arr[i] = 1;

        return check(i + leap, leap, arr) ||
                check(i + 1, leap, arr) ||
                check(i - 1, leap, arr);
    }

    public static void main(String[] args) throws IOException {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int leap = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            System.out.println(Java_1D_Array_Part_2_V2.check(0, leap, arr) ? "YES" : "NO");

        }

    }
}
