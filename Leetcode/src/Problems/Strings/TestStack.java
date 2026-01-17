package Problems.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
 
        System.out.println(reverseList(result));

    }

    public static List<Integer> reverseList(List<Integer> result) {

        Stack<Integer> stack = new Stack<>();

        stack.addAll(result);

        for (int i = 0; i < result.size(); i++) {
            result.set(i, stack.pop());
        }

        return result;

    }
}
