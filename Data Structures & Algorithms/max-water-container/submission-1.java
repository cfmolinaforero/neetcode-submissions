class Solution {
    public static int maxArea(int[] heights) {
      int maxArea = 0;

      int l = 0, r = heights.length - 1, area;
      while (l < r) {
         area = (r - l) * Math.min(heights[r], heights[l]);
         maxArea = Math.max(area, maxArea);

         if (heights[l] < heights[r])
            l++;
         else
            r--;
      }

      return maxArea;
   }
}
