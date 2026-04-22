class Solution {
    static int lengthOfLongestSubstring(String s) {
      int maxLength = Integer.MIN_VALUE;
      HashSet<Character> set = new HashSet<>();

      int l = 0;
      set.add(s.charAt(l));
      for (int r = 1; r < s.length(); r++) {
         while (set.contains(s.charAt(r))) {
            maxLength = Math.max(maxLength, r - l);
            set.remove(s.charAt(l));
            l++;
         }
         set.add(s.charAt(r));
         maxLength = Math.max(maxLength, r - l);
      }

      return maxLength;
   }
}
