class Solution {
    static int maxSubArray(int[] nums) {
      if (nums.length == 0)
         return Integer.MIN_VALUE;

      int maxSum = nums[0];
      int curSum = 0;

      for (int num : nums) {
         curSum = Math.max(curSum, 0);
         curSum += num;
         maxSum = Math.max(curSum, maxSum);
      }

      return maxSum;
   }
}
