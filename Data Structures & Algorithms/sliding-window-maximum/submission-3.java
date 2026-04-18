class Solution {
    static int[] maxSlidingWindow(int[] nums, int k) {
      int[] maxElems = new int[nums.length - k + 1];

      Deque<Integer> deque = new ArrayDeque<>();

      for (int r = 0, l = r - k + 1; r < nums.length; r++, l++) {
         while (!deque.isEmpty() && deque.peek() < l) {
            deque.pollFirst();
         }

         while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[r]) {
            deque.pollLast();
         }

         deque.add(r);

         if (l >= 0) {
            maxElems[l] = nums[deque.peek()];
         }
      }

      return maxElems;
   }
}
