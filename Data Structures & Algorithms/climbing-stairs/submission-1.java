class Solution {
    public int climbStairs(int n) {
      int[] dp = new int[n+1];
      return climbStairsDP(n, dp);
   }

   public int climbStairsDP(int n, int[] dp) {
      if (dp[n] != 0)
         return dp[n];

      if (n == 1)
         return 1;
      if (n == 2)
         return 2;

      return climbStairsDP(n - 1, dp) + climbStairsDP(n - 2, dp);
   }
}
