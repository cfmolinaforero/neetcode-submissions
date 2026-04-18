class Solution {
    public static int maxArea(int[] heights) {
      int area = 0;

      for (int i = 0; i < heights.length - 1; i++) {
         int h1 = heights[i];

         for (int j = i + 1; j < heights.length; j++) {
            int h2 = heights[j];

            int width = j - i;
            int height = Math.min(h1, h2);
            int currArea = height * width;
            area = Math.max(area, currArea);
         }
      }

      return area;
   }
}
