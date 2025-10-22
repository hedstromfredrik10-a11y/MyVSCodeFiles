package Tenta_2025_02_20;

public class P4 {
    public static void main(String[] args) {
        // String[] arr = { "Bertil", "Adam", "Cesar", "alex" };
        String[] arr = { "Bertil", "adam", "Amanda", "Cesar", "Alva" };
        System.out.println(nbrOfNamesOnA(arr));

    }

    public static int nbrOfNamesOnA(String[] names) {
        int result = 0;

        for (String string : names) {
            if (string.substring(0, 1).equalsIgnoreCase("a")) {
                result++;
            }
        }
        return result;
    }
}
