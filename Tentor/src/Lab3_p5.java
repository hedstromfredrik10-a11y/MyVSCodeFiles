import java.util.Arrays;
import java.util.Scanner;

public class Lab3_p5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv in tre namn: ");
        String names = scan.nextLine();
        String[] namesArray = names.split("\\s+");
        Arrays.sort(namesArray);

        for (String string : namesArray)
            System.out.println(string);

        scan.close();
    }
}
