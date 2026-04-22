class Solution {
    public static int trap(int[] height) {
      int totalArea = 0;
      int l = 0, r = height.length - 1, lMax = 0, rMax = 0;

      while (l <= r) {
         if (lMax < rMax) {
            l++;
            lMax = Math.max(lMax, height[l]);
            totalArea += lMax - height[l];
         } else {
            r--;
            rMax = Math.max(rMax, height[r]);
            totalArea += rMax - height[r];
         }
      }

      return totalArea;
   }
}
