class Solution {
    public static int trap(int[] height) {
      int[] leftMax = new int[height.length];
      int[] rightMax = new int[height.length];
      int[] ceiling = new int[height.length];

      for (int i = 0; i < height.length; i++) {
         int rightIndex = height.length - 1 - i;
         if (i == 0) {
            leftMax[i] = 0;
            rightMax[rightIndex] = 0;
         } else {
            leftMax[i] = Math.max(leftMax[i - 1], height[i - 1]);
            rightMax[rightIndex] = Math.max(rightMax[rightIndex + 1], height[rightIndex + 1]);
         }
      }

      int totalArea = 0;
      for (int i = 0; i < height.length; i++) {
         ceiling[i] = Math.min(leftMax[i], rightMax[i]);
         int area = ceiling[i] - height[i];
         if (area > 0)
            totalArea += area;
      }

      return totalArea;
   }
}
