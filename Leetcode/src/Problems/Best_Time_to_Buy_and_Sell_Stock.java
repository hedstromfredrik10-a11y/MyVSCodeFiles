package Problems;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        // int[] prices = { 7, 1, 5, 3, 6, 4 };
        int[] prices = { 3, 2, 6, 5, 0, 3 };
        // int[] prices = { 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min_val = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_val) {
                min_val = prices[i];
            } else if (prices[i] - min_val > max_profit) {
                max_profit = prices[i] - min_val;
            }
        }

        return max_profit;
    }
}
