package Problems.Arrays;

public class Check_if_Every_Row_and_Column_Contains_All_Numbers {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };
        System.out.println(checkValid(matrix));

    }

    public static boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int num = matrix[i][j];
            }
        }

        return false;
    }
}
