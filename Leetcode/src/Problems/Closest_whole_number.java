package Problems;

import java.util.Scanner;

public class Closest_whole_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        while (input != 999) {
            input = Integer.parseInt(scan.nextLine());
            if (input != 999) {
                System.out.println(closestWholeNumber(input));

            } else {
                break;
            }

        }

        scan.close();
    }

    public static int closestWholeNumber(int input) {
        int roof = input;
        int floor = input;
        int countIncrease = 0;
        int countDecrease = 0;
        int result = 0;
        boolean checkIncrease = false;
        boolean checkDecrease = false;

        while (true) {
            if (checkIncrease == false) {
                roof++;
                countIncrease++;
            }

            if (checkDecrease == false) {
                floor--;
                countDecrease++;
            }

            if (roof % 10 == 0) {
                checkIncrease = true;
            }

            if (floor % 10 == 0) {
                checkDecrease = true;
            }

            if ((checkIncrease == true) && (checkDecrease == true)) {
                break;
            }

        }

        if (countIncrease < countDecrease) {
            result = roof;
        } else if (countIncrease > countDecrease) {
            result = floor;
        } else if (countIncrease == countDecrease) {
            result = input;
        }

        return result;

    }
}
