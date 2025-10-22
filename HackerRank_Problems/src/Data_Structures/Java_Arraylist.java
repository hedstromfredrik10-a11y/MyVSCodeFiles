package Data_Structures;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_Arraylist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        ArrayList<ArrayList<Integer>> myArrayList = new ArrayList<>();

        int counter = 0;
        while (counter < n) {
            int x = scan.nextInt();
            ArrayList<Integer> rader = new ArrayList<>();
            for (int i = 0; i < x; i++) {
                rader.add(scan.nextInt());
            }
            myArrayList.add(rader);

            counter++;
        }

        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            try {
                System.out.println(myArrayList.get(a - 1).get(b - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        scan.close();
    }
}
