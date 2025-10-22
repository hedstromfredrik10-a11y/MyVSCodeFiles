package Data_Structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        List<Integer> L = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            L.add(scan.nextInt());
            
        }
        scan.nextLine();

        int x = Integer.parseInt(scan.nextLine());

        int counter = 0;

        while (counter < x) {
            String str = scan.nextLine();

            switch (str) {
                case "Insert":
                    int index = scan.nextInt();
                    int value = scan.nextInt();
                    scan.nextLine();
                    L.add(index, value);
                    break;

                case "Delete":
                    int indexRemoval = Integer.parseInt(scan.nextLine());
                    L.remove(indexRemoval);
                    break;

                default:
                    System.out.println("ERROR!");
                    break;
            }
            counter++;
        }

        L.forEach(e -> System.out.print(e + " "));

        scan.close();
    }
}
