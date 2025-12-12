import java.util.Scanner;

public class Lab3_p4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ange grader: ");
        double degrees = Double.parseDouble(scan.nextLine());

        System.out.print("Ange enhet (C eller F): ");
        String degreeType = scan.nextLine();

        System.out.print("Ange höjd: ");
        double height = Double.parseDouble(scan.nextLine());

        System.out.print("Ange höjdenhet (m eller f): ");
        String heightType = scan.nextLine();

        if (degreeType.equals("F")) {
            degrees = (degrees - 32) * 5 / 9;
        }

        if (heightType.endsWith("f")) {
            height = height * 0.30048;
        }

        int increaseInBoilingPoint = 0;
        while (height >= 300) {
            height = height - 300;
            increaseInBoilingPoint++;
        }

        int boilingpoint = 100;
        boilingpoint += increaseInBoilingPoint;

        if (degrees >= 0 && degrees < boilingpoint) {
            System.out.println("Flytande");
        } else if (degrees < 0) {
            System.out.println("Fast");
        } else {
            System.out.println("Gas");
        }

        scan.close();
    }
}
