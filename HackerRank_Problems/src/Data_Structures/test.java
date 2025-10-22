package Data_Structures;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -2, 4, -6, -8 };
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeNumbers.add(arr[i]);
            } else {
                positiveNumbers.add(arr[i]);
            }
        }
        
        System.out.println(negativeNumbers);
        System.out.println(positiveNumbers);
    }
}
