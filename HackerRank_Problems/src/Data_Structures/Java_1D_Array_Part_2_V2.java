package Data_Structures;

import java.util.Scanner;

public class Java_1D_Array_Part_2_V2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        scan.nextLine();
        int counter = 0;

        while (counter < q) {
            int n = scan.nextInt();

            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            if (canWin.leapTest(game, n, leap)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            counter++;

        }
        scan.close();
    }
}

class canWin {
    public static boolean leapTest(int[] game, int n, int leap) {
        boolean win = true;
        boolean flag = true;
        int x = 0;
        for (int i = 0; i < game.length; i++) {
            int failCounter = 0;
            try {
                if (game[i] == 0) {
                    if (game[i + leap] == 0) {
                        i = i + leap;
                    } else {
                        failCounter++;
                        if (game[i + 1] == 0) {
                            i = i + 1;
                            if (game[i + leap] == 0) {
                                i = i + leap;
                            } else {
                                flag = false;
                            }
                        } else if (game[i - 1] == 0) {
                            i = i - 1;
                            if (game[i + leap] == 0) {
                                i = i + leap;
                            } else {
                                flag = false;
                            }
                        }
                    }
                } else if (game[i] == 1) {
                    int onesInARow = 0;
                    x = i;
                    while (game[x] == 1) {
                        onesInARow++;
                        if (x == (game.length - 1)) {
                            break;
                        } else {
                            x++;
                        }
                    }
                    if (onesInARow >= leap) {
                        i = game.length;
                        win = false;
                    }
                }
                if (flag == false) {
                    win = false;
                    i = game.length;
                }

            } catch (Exception e) {
                win = true;
            }
        }

        return win;
    }
}
