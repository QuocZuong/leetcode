public class BestTimetoBuyandSellStockII {
    public static int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 0;
        int totalProfit = 0;
        int i = 0;
        int n = prices.length - 1;

        while (i < n) {
            while (i < n && prices[i] >= prices[i + 1]) // truoc lon hon hoac bang sau thi skip
                i++;
            buy = prices[i];

            while (i < n && prices[i] < prices[i + 1])
                i++;
            sell = prices[i];
            totalProfit += sell - buy;

        }

        return totalProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[] { 3, 2, 5, 8, 1, 9 };
        System.out.println(maxProfit(prices));
    }
}
