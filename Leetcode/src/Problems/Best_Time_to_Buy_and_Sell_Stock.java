package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        // int[] prices = { 7, 1, 5, 3, 6, 4 };
        int[] prices = { 3, 2, 6, 5, 0, 3 };
        // int[] prices = { 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int result = 0;
        List<Integer> list = new ArrayList<>();

        for (Integer integer : prices) {
            list.add(integer);
        }

        Collections.sort(list);

        int lowest = list.get(0);
        int highest = list.get(list.size() - 1);
        
        return result;
    }
}
