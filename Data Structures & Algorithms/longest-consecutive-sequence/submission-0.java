class Solution {
    /**
    * Input: nums = [2,20,4,10,3,4,5]
    * Output: 4
    */
   public static int longestConsecutive(int[] nums) {
      if (nums.length == 0)
         return 0;

      int length = 1;

      HashSet<Integer> set = new HashSet<>();
      for (int i = 0; i < nums.length; i++) {
         set.add(nums[i]);
      }

      for (int i : set) {
         // if i is not the start of a sequence
         if (set.contains(i - 1))
            continue;

         // is start of sequence
         int count = 1;
         int curr = i;
         while (set.contains(curr + 1)) {
            curr = curr + 1;
            count++;
         }

         length = Math.max(length, count);
      }

      return length;
   }

   public static void main(String[] args) {
      System.out.println(longestConsecutive(new int[] { 0, 2, 3, 4 }));
   }
}
