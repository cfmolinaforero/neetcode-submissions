class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> res = new ArrayList<>();

      int i1, i2, i3;
      for (i1 = 0; i1 < nums.length - 2; i1++) {
         i2 = i1 + 1;
         i3 = nums.length - 2;

         while (i2 < i3) {
            int sum = nums[i1] + nums[i2] + nums[i3];
            if (sum == 0) {
               res.add(Arrays.asList(nums[i1], nums[i2], nums[i3]));
               break;
            } else if (sum < 0)
               i2++;
            else
               i3--;
         }
      }

      return res;
   }
}
