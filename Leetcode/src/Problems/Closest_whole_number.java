package Problems;

import java.util.Scanner;

public class Closest_whole_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        while (input != 999) {
            System.out.print("Skriv in ett heltal (skriv 999 för att avsluta): ");
            input = Integer.parseInt(scan.nextLine());
            if (input != 999) {
                System.out.println("Närmsta heltal är: " + closestWholeNumber(input));
            } else {
                break;
            }

        }

        scan.close();
    }

    public static int closestWholeNumber(int input) {
        int modulusResult = 0;
        modulusResult = input % 10;

        if (modulusResult >= 5) {
            input += 10 - modulusResult;
        } else {
            input -= modulusResult;
        }

        return input;

    }
}
