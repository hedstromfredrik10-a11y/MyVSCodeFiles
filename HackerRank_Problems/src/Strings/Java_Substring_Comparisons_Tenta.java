package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Java_Substring_Comparisons_Tenta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallestStr = "";
        String largestStr = "";

        ArrayList<String> arrList = new ArrayList<String>();
        int counter = s.length();

        for (int i = 0; i < counter; i++) {
            try {
                arrList.add(s.substring(i, k + i));

            } catch (Exception e) {
                counter = i;
            }
        }

        Collections.sort(arrList);

        smallestStr = arrList.get(0);
        largestStr = arrList.get(arrList.size() - 1);

        // System.out.println(arrList);
        return smallestStr + "\n" + largestStr;
    }

}
