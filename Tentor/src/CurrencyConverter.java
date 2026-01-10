import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String chooseCurrency = "SEK, EUR, USD";
        System.out.println("Välj bland följande:" + "\n" + chooseCurrency);
        String continueConversion = "";
        String[] validInputs = { "EUR", "SEK", "USD" };

        while (!continueConversion.equalsIgnoreCase("n")) {
            boolean check = false;
            String input;
            System.out.print("Ange in-valuta: ");
            do {
                input = scan.nextLine();
                for (String string : validInputs) {
                    if (input.equals(string)) {
                        check = true;
                    }
                }
                if (check == false) {
                    System.out.print("Felaktigt värde: " + input + "\n" + "Välj igen: ");
                }

            } while (check == false);
            check = false;
            String output;

            System.out.print("Ange ut-valuta: ");
            do {
                output = scan.nextLine();
                for (String string : validInputs) {
                    if (output.equals(string)) {
                        check = true;
                    }
                }
                if (check == false) {
                    System.out.print("Felaktigt värde: " + output + "\n" + "Välj igen: ");
                }

            } while (check == false);

            System.out.print("Ange antal in-value: ");
            double choosenValue = Double.parseDouble(scan.nextLine());
            System.out.println(choosenValue + " " + input + " konverterat till " + output + " blir " + convert(input, output, choosenValue) + " " + output);

            System.out.print("Vill du köra igen? (J/n): ");
            continueConversion = scan.nextLine();
        }

        System.out.println("Tack för idag.");

        scan.close();

    }

    public static double convert(String input, String output, double value) {
        if (input.equalsIgnoreCase(output)) {
            return value;
        }
        double converter = selectCurrency(input + output);
        return value * converter;
    }

    public static double selectCurrency(String input) {
        double conversionValue = 0;
        final double[][] CONVERT_MATRIX = {
                { 1.0, 0.089, 0.1 },
                { 11.18, 1.0, 1.17 },
                { 9, 54, 0.85, 1.0 }
        };
        switch (input) {
            case "SEKEUR":
                conversionValue = CONVERT_MATRIX[0][1];
                break;
            case "SEKUSD":
                conversionValue = CONVERT_MATRIX[0][2];
                break;

            case "EURSEK":
                conversionValue = CONVERT_MATRIX[1][0];
                break;

            case "EURUSD":
                conversionValue = CONVERT_MATRIX[1][2];
                break;

            case "USDSEK":
                conversionValue = CONVERT_MATRIX[2][0];
                break;

            case "USDEUR":
                conversionValue = CONVERT_MATRIX[2][1];
                break;

            default:
                break;
        }
        return conversionValue;

    }

}
