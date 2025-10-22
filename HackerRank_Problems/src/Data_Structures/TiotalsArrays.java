package Data_Structures;

public class TiotalsArrays {
    public static void main(String[] args) {
        int[] arr = { 10, -20, 30, 15, 5, 100, 102 };
        System.out.println(nbrOfElements(arr));
    }

    public static int nbrOfElements(int[] numbers) {
        int result = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 10 == 0) {
                result++;
            }
        }

        return result;
    }
}
