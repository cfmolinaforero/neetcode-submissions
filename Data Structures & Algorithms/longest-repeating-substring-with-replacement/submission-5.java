class Solution {
    static int characterReplacement(String s, int k) {
      HashMap<Character, Integer> map = new HashMap<Character, Integer>();

      int maxLength = 0, l = 0;
      for (int r = 0; r < s.length(); r++) {
         // Increase count of current letter
         map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

         // windowSize - maxValueCount = represents number of characters to be replaced
         // if this exceeds k we must remove to stay within boundary
         while ((r - l + 1) - Collections.max(map.values()) > k) {
            if (map.get(s.charAt(l)) > 1)
               map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
            else
               map.remove(s.charAt(l));
            l++;
         }

         maxLength = Math.max(maxLength, r - l + 1);
      }

      return maxLength;
   }
}
