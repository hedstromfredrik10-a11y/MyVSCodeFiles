package Data_Structures;

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
}
