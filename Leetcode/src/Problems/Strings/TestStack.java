package Problems.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        for (Integer integer : input) {
            stack.push(integer);
        }

        System.out.println(reverseList(result, stack));

    }

    public static List<Integer> reverseList(List<Integer> result, Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return result;
        }

        int temp = stack.pop();

        result.add(temp);

        return reverseList(result, stack);

    }
}
