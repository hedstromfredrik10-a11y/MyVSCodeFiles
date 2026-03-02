
// kalärprodukten av två vektorer 𝐚 och 𝐛 med längd 𝑛 definieras som
// 𝐚 ⋅ 𝐛 = 𝑎0𝑏0 + 𝑎1𝑏1 + ⋯ + 𝑎𝑛−1𝑏𝑛−1

public class ScalarProduct {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };
        System.out.println(scalarProduct(arr1, arr2));

    }

    public static int scalarProduct(int[] arr1, int[] arr2) {
        int product = 0;
        if (arr1.length != arr2.length || arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Invalid input for arrays");
        } else if (arr1.length == 0 && arr2.length == 0) {
            return 0;
        }

        for (int i = 0; i < arr2.length; i++) {
            product += arr1[i] * arr2[i];
        }

        return product;
    }

}
