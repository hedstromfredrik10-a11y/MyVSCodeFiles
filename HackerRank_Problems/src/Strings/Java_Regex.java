package Strings;

import java.util.Scanner;

/* Sample Input

000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP
Sample Output

true
true
true
false
false
false */

public class Java_Regex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hur mång IP-addresser vill du kontrollera? ");
        int amount = scan.nextInt();
        scan.nextLine();
        int counter = 1;
        while (counter <= amount) {
            System.out.printf("%s%d: ", "IP-address ", counter);
            String input = scan.nextLine();
            System.out.println(MyIpCheckerClass.ipCheck(input));
            counter++;
        }
        scan.close();
    }
}

class MyIpCheckerClass {
    public static boolean ipCheck(String s) {
        boolean result = true;
        int counter = 0;
        try {
            for (int n = 0; n < s.length(); n++) {
                if (s.charAt(n) == '.') {
                    counter++;
                    if (counter > 4) {
                        result = false;
                    }
                }
            }

            s = s.replace(".", " ");
            String[] arr = s.split("\\s+");
            if (arr.length > 4 || arr.length < 4) {
                result = false;
            } else {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].length() > 3) {
                        result = false;
                    }
                    if (arr[i].matches(".*[A-Za-z].*")) {
                        result = false;
                    } else if (Integer.valueOf(arr[i]) > 255 || Integer.valueOf(arr[i]) < 0) {
                        result = false;
                    }
                }
            }
        } catch (Exception e) {
            result = false;
        }
        return result;
    }
}
