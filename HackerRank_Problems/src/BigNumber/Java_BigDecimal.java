package BigNumber;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_BigDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = scan.nextLine();
            list.add(s);
        }

        list.sort((a, b) -> new BigDecimal(b).compareTo((new BigDecimal(a))));

        for (String string : list) {
            System.out.println(string);
        }

        scan.close();
    }
}
