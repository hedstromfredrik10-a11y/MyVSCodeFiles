import java.util.Scanner;

public class Lab3_p2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input1 = scan.nextInt();
        int input2 = scan.nextInt();
        int input3 = scan.nextInt();

        if (input1 == input2 && input2 == input3)
            System.out.println("Alla lika");
        else if (input1 != input2 && input2 != input3 && input1 != input3)
            System.out.println("Alla olika");
        else
            System.out.println("Varken eller");

        scan.close();
    }
}
