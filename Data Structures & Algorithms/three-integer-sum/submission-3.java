class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> res = new ArrayList<>();
      Arrays.sort(nums);

      int i1, i2, i3;
      for (i1 = 0; i1 < nums.length - 2; i1++) {
         if (i1 > 0 && nums[i1] == nums[i1 - 1])
            continue;

         i2 = i1 + 1;
         i3 = nums.length - 1;

         while (i2 < i3) {
            int sum = nums[i1] + nums[i2] + nums[i3];
            if (sum == 0) {
               res.add(Arrays.asList(nums[i1], nums[i2], nums[i3]));
            }

            if (sum < 0) {
               i2++;
               while (i2 < nums.length && nums[i2] == nums[i2 - 1]) {
                  i2++;
               }
            } else {
               i3--;
               while (i3 > 0 && nums[i3] == nums[i3 + 1])
                  i3--;
            }
         }
      }

      return res;
   }
}
