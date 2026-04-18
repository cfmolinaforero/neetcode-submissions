class Solution {
    static int lengthOfLongestSubstring(String s) {
      if (s.length() == 0 || s.length() == 1)
         return s.length();
      int maxLength = 0;
      HashSet<Character> set = new HashSet<>();

      set.add(s.charAt(0));
      for (int r = 1; r < s.length(); r++) {
         while (set.contains(s.charAt(r))) {
            set.remove(s.charAt(r - set.size()));
         }
         set.add(s.charAt(r));
         maxLength = Math.max(maxLength, set.size());
      }

      return maxLength;
   }
}
