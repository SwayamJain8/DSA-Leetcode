class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            int currProfit = prices[i] - minBuy;
            maxProfit = Math.max(currProfit, maxProfit);
            if(prices[i] < minBuy) {
                minBuy = prices[i];
            }
        }
        return maxProfit;
    }
}