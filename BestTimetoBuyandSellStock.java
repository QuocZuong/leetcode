public class BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {

        int maxProfitResult = 0;
        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }

            else if (maxProfitResult < prices[i] - buy) {
                maxProfitResult = prices[i] - buy;
            }
        }

        return maxProfitResult;
    }

    public static void main(String[] args) {
        int[] prices = new int[] { 3, 2, 6, 5, 0, 3 };
        System.out.println(maxProfit(prices));
    }
}
