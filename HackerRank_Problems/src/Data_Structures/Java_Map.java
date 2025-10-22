package Data_Structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JFrame;

public class Java_Map extends JFrame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        scan.nextLine();
        int counter = 0, counter2 = 0, phoneNr;
        String[] str = new String[count];
        int[] numbers = new int[count];
        while (counter < count) {
            String name = scan.nextLine();
            // scan.nextLine();
            phoneNr = scan.nextInt();
            scan.nextLine();
            str[counter] = name;
            numbers[counter] = phoneNr;

            counter++;
        }
        counter = 0;
        String findName;
        while (counter < count) {
            counter2 = 0;
            findName = scan.nextLine();
            boolean flag = false;
            for (String s : str) {
                if (findName.equalsIgnoreCase(s)) {
                    System.out.println(findName + " = " + numbers[counter]);
                    flag = true;
                }

                if ((flag == false) && (counter2 == count - 1)) {
                    System.out.println("Not Found");
                }
                counter2++;
            }
            counter++;
        }

        scan.close();
    }

    // public static void main(String[] argh) {
    //     Scanner in = new Scanner(System.in);

    //     int n = in.nextInt();

    //     if (n < 0 || n > 100000) {
    //         throw new IllegalArgumentException(
    //                 "The number of people-phones cannot be lower than 0 or greater than 100,000");
    //     }

    //     Map<String, Integer> phoneBook = new HashMap<>();

    //     in.nextLine();

    //     for (int i = 0; i < n; i++) {
    //         String name = in.nextLine().toLowerCase();
    //         Integer phone = in.nextInt();
    //         in.nextLine();

    //         if (String.valueOf(phone).length() != 8) {
    //             throw new IllegalArgumentException(String.format("The phone number %s is not 8 digits long", phone));
    //         }

    //         phoneBook.put(name, phone);
    //     }

    //     while (in.hasNext()) {
    //         String s = in.nextLine().toLowerCase();

    //         Integer phone = phoneBook.get(s);

    //         if (phone == null) {
    //             System.out.println("Not found");
    //         } else {
    //             System.out.println(String.format("%s=%d", s, phone));
    //         }
    //     }
    // }
}
