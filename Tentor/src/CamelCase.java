public class CamelCase {
    public static void main(String[] args) {
        // hejsanHoppanPåDig
        String input = "    hejSAN   hoppsan PÅ DIG     ";
        System.out.println(toCamelCase(input));
    }

    public static String toCamelCase(String input) {
        String[] arr = input.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        sb.append(arr[0].toLowerCase());

        for (int i = 1; i < arr.length; i++) {
            sb.append(arr[i].substring(0, 1).toUpperCase()).append(arr[i].substring(1, arr[i].length()).toLowerCase());
        }

        return sb.toString();
    }
}
