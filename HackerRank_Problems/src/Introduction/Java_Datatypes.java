package Introduction;

//Sample Input
//
//5
//-150
//150000
//1500000000
//213333333333333333333333333333333333
//-100000000000000
//Sample Output
//
//-150 can be fitted in:
//* short
//* int
//* long
//150000 can be fitted in:
//* int
//* long
//1500000000 can be fitted in:
//* int
//* long
//213333333333333333333333333333333333 can't be fitted anywhere.
//-100000000000000 can be fitted in:
//* long
//A byte is an 8-bit signed integer.
//A short is a 16-bit signed integer.
//An int is a 32-bit signed integer.
//A long is a 64-bit signed integer.

import java.util.Scanner;

public class Java_Datatypes {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int q = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < q; i++) {
			String s = scan.nextLine();

			try {

				long x = Long.parseLong(s);

				System.out.println(s + " can be fitted in:");
				if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
					System.out.println("* byte");
				}

				if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
					System.out.println("* short");
				}

				if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
					System.out.println("* int");
				}

				if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
					System.out.println("* long");
				}

			} catch (NumberFormatException e) {
				System.out.println(s + " can't be fitted anywhere.");
			}

		}

		scan.close();
	}
}
