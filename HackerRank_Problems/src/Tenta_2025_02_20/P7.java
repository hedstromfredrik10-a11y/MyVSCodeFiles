package Tenta_2025_02_20;

import java.util.Random;
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        int poäng = 0;
        while (true) {
            int tal1 = gen.nextInt(11);
            int tal2 = gen.nextInt(11);
            int val = gen.nextInt(3);
            String[] operations = { "+", "-", "*" };
            int[] correctAnswers = { tal1 + tal2, tal1 - tal2, tal1 * tal2 };

            System.out.println("Vad blir " + tal1 + " " + operations[val] + " " + tal2 + "?");

            long tid = System.currentTimeMillis();
            int answer = scan.nextInt();
            tid = System.currentTimeMillis() - tid;

            if (tid >= 5000) {
                System.out.println("Du var för långsam!!");
                System.out.println("Poäng: " + poäng);

                break;
            } else {
                if (answer == correctAnswers[val]) {
                    System.out.println("Rätt svar");
                    poäng++;
                    System.out.println("Poäng: " + poäng);
                } else {
                    System.out.println("Fel svar!");
                    System.out.println("Poäng: " + poäng);

                    break;
                }

            }

        }

        scan.close();
    }
}
