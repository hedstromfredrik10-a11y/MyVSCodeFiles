import java.util.Scanner;

public class Two_sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] arr = s.split("\\s+");

        int[] input = { 2, 7, 11, 15 };
        int target = 9;
        for (String a : arr) {
            

        }
        

        for (int i = 0; i < input.length; i++) {
            for (int x = (i + 1); i < input.length; i++) {
                if ((input[i] + input[x]) == target) {
                    System.out.println("[" + i + "," + x + "]");
                }
            }
        }

        scan.close();
    }
}
