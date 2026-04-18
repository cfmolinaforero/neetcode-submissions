class Solution {
    // find minimum k - rate of eating bananas per hour (within h hours)
   public int minEatingSpeed(int[] piles, int h) {
      if (piles == null || piles.length == 0 || h < piles.length)
         return -1;

      int pilesMax = piles[0];
      for (int pile : piles)
         pilesMax = Math.max(pilesMax, pile);

      // 1 to pilesMax
      int l = 1, r = pilesMax;
      int k = pilesMax;
      while (l <= r) {
         int m = l + (r - l) / 2;
         int hours = 0;

         // Find # of hours it takes with current rate k (m)
         for (int i = 0; i < piles.length; i++) {
            hours += (int) Math.ceil((double) piles[i] / m);
         }

         if (hours <= h) {
            k = m;
            r = m - 1;
         } else {
            l = m + 1;
         }
      }

      return k;
   }
}
