package Problems.Strings;

import java.util.Arrays;

// You are given two strings, coordinate1 and coordinate2, representing the coordinates of a square on an 8 x 8 chessboard.

// Example 1:
// Input: coordinate1 = "a1", coordinate2 = "c3"
// Output: true

// Explanation:
// Both squares are black.

// Example 2:
// Input: coordinate1 = "a1", coordinate2 = "h3"
// Output: false

// Explanation:
// Square "a1" is black and "h3" is white.

public class Check_if_Two_Chessboard_Squares_Have_the_Same_Color {
    public static void main(String[] args) {
        String coordinate1 = "h7";
        String coordinate2 = "c8";

        System.out.println(checkTwoChessboards(coordinate1, coordinate2));

    }

    public static boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        boolean result = false;

        String[][] chessBoard = new String[8][8];

        int[] x_yCoordinate1 = checkLetterCoordinate(coordinate1);
        int[] x_yCoordinate2 = checkLetterCoordinate(coordinate2);

        System.out.println(Arrays.toString(x_yCoordinate1));
        System.out.println(Arrays.toString(x_yCoordinate2));

        for (int i = 0; i <= 7; i = i + 2) {
            for (int j = 0; j <= 7; j++) {
                if (j % 2 == 0) {
                    chessBoard[i][j] = "Black";
                } else {
                    chessBoard[i][j] = "White";
                }
            }
        }

        for (int i = 1; i <= 7; i = i + 2) {
            for (int j = 0; j <= 7; j++) {
                if (j % 2 == 0) {
                    chessBoard[i][j] = "White";
                } else {
                    chessBoard[i][j] = "Black";
                }
            }
        }

        String s = chessBoard[x_yCoordinate1[0]][x_yCoordinate1[1]];
        String s2 = chessBoard[x_yCoordinate2[0]][x_yCoordinate2[1]];

        System.out.println(s);
        System.out.println(s2);

        if (chessBoard[x_yCoordinate1[0]][x_yCoordinate1[1]] == chessBoard[x_yCoordinate2[0]][x_yCoordinate2[1]]) {
            result = true;
        }

        return result;

    }

    public static int[] checkLetterCoordinate(String input) {
        int[] x_y = new int[2];

        switch (input.charAt(0)) {
            case 'a':
                x_y[0] = 0;
                break;
            case 'b':
                x_y[0] = 1;
                break;
            case 'c':
                x_y[0] = 2;
                break;
            case 'd':
                x_y[0] = 3;
                break;
            case 'e':
                x_y[0] = 4;
                break;
            case 'f':
                x_y[0] = 5;
                break;
            case 'g':
                x_y[0] = 6;
                break;
            case 'h':
                x_y[0] = 7;
                break;
            default:
                break;
        }

        x_y[1] = input.charAt(1) - '0' - 1;

        return x_y;
    }

}
