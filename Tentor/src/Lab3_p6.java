import java.util.Scanner;

public class Lab3_p6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mata in start och stop: ");
        int start = scan.nextInt();
        int stop = scan.nextInt();

        System.out.println("Startvärde: " + start + "\n" + "Stopvärdet: " + stop);
        int input;

        do {
            System.out.print("Mata in startvärdet för att börja: ");
            input = scan.nextInt();
        } while (input != start);

        int sum = 0;

        if (start % 2 == 1) {
            sum += start;
        }
        while (input != stop) {
            System.out.print("Mata int ett tal: ");
            input = scan.nextInt();
            sum += input;
        }

        if (stop % 2 == 1) {
            sum += stop;
        }

        System.out.println("Summan blir: " + sum);

        scan.close();
    }
}
