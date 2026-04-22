class Solution {
    static int[] maxSlidingWindow(int[] nums, int k) {
      int[] maxElems = new int[nums.length - k + 1];

      int max = Integer.MIN_VALUE;
      int secondMax = Integer.MIN_VALUE;
      HashMap<Integer, Integer> wMap = new HashMap<>();

      for (int i = 0; i < k - 1; i++) {
         int val = nums[i];
         if (val > max)
            max = val;

         wMap.put(val, wMap.getOrDefault(val, 0) + 1);
      }

      for (int l = 0, r = l + k - 1; r < nums.length; l++, r++) {
         int rVal = nums[r];
         wMap.put(rVal, wMap.getOrDefault(rVal, 0) + 1);

         if (rVal > max) {
            secondMax = max;
            max = rVal;
         }

         maxElems[l] = max;

         int lVal = nums[l];
         wMap.put(lVal, wMap.get(lVal) - 1);

         if (lVal == max && wMap.get(lVal) < 1)
            max = secondMax;
      }

      return maxElems;
   }
}
