class Solution {
    public static int maxProfit(int[] prices) {
      int profit = 0;

      int l = 0;
      for (int r = 1; r < prices.length; r++) {
         int diff = prices[r] - prices[l];
         while (diff < 0){
            l++;
            diff = prices[r] - prices[l];
         }
         profit = Math.max(profit, diff);
      }

      return profit;
   }
}
