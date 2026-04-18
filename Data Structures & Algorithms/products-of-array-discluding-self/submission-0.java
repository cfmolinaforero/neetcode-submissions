class Solution {
   static int[] productExceptSelf(int[] nums) {
      int[] output = new int[nums.length];
      int[] prefixProduct = new int[nums.length];
      int[] postfixProduct = new int[nums.length];

      prefixProduct[0] = nums[0];
      for (int i = 1; i < nums.length; i++) {
         prefixProduct[i] = prefixProduct[i - 1] * nums[i];
      }

      postfixProduct[nums.length - 1] = nums[nums.length - 1];
      for (int i = nums.length - 2; i >= 0; i--) {
         postfixProduct[i] = postfixProduct[i + 1] * nums[i];
      }

      output[0] = postfixProduct[1];
      output[nums.length - 1] = prefixProduct[nums.length - 2];
      for (int i = 1; i < nums.length - 1; i++) {
         output[i] = prefixProduct[i - 1] * postfixProduct[i + 1];
      }

      return output;
   }
}
