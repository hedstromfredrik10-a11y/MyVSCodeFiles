package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveCharAtIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mata in en sträng: ");
        String inputString = scan.nextLine();
        System.out.print("Mata in ett index: ");
        int inputInt = Integer.parseInt(scan.nextLine());

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            list.add(inputString.charAt(i));
        }

        char c = list.get(inputInt);
        list.remove(inputInt);
        StringBuilder sb = new StringBuilder();
        for (char a : list) {
            sb.append(a);
        }

        System.out.println("Den nya strängen är: " + sb);
        System.out.println("Den borttagna bokstaven är: " + c + " vid index " + inputInt);

        scan.close();
    }
}
