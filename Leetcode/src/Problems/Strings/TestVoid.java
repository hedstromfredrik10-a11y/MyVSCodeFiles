package Problems.Strings;

public class TestVoid {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        printReverseArray(array, array.length - 1);
    }

    public static void printReverseArray(int[] arr, int index) {
        if (index < 0) {
            return;
        }

        System.out.println(arr[index]);
        printReverseArray(arr, index - 1);
    }
}
