class Solution {
    static int lengthOfLongestSubstring(String s) {
      if (s.length() == 0 || s.length() == 1)
         return s.length();
      int maxLength = Integer.MIN_VALUE;
      HashSet<Character> set = new HashSet<>();

      int l = 0;
      set.add(s.charAt(l));
      for (int r = 1; r < s.length(); r++) {
         while (set.contains(s.charAt(r))) {
            set.remove(s.charAt(l));
            l++;
         }
         set.add(s.charAt(r));
         maxLength = Math.max(maxLength, r - l + 1);
      }

      return maxLength;
   }
}
