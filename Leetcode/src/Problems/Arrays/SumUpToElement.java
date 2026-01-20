package Problems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumUpToElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 6, 7, 8, 2, 9, 8, 2, 8));
        int stopNumber = 5;
        System.out.println(sumUpTo(list, stopNumber));
        System.out.println(IntStream.of(3, 5, 6, 7, 8, 2).sum());

        int[] arr = list.stream().mapToInt(Integer::intValue).filter(n -> n == 8).toArray();
        System.out.println(Arrays.toString(arr));
    }

    // public static int sumUpTo(List<Integer> list, int stopNumber) {
    // int index = 0;
    // boolean indexFound = false;
    // for (int i = 0; i < list.size(); i++) {
    // if (list.get(i) == stopNumber) {
    // index = i;
    // indexFound = true;
    // }
    // }

    // if (!indexFound) {
    // index = list.size() - 1;
    // }

    // return sum(list, index);

    // }

    // public static int sum(List<Integer> list, int index) {
    // if (index < 0) {
    // return 0;
    // }

    // if (list.size() == 0) {
    // return 0;
    // }

    // if (list.size() == 1) {
    // return list.get(0);
    // }

    // return list.get(index) + sum(list, index - 1);
    // }

    public static int sumUpTo(List<Integer> list, int stopNumber) {
        int sum = list.removeFirst();
        
        return sum + sumUpTo(list, stopNumber);
    }
}
