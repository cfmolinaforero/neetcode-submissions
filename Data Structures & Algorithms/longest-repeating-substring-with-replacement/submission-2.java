class Solution {
    static int characterReplacement(String s, int k) {
      int maxLength = 0;
      HashMap<Character, Integer> map = new HashMap<>();

      int l = 0, r = 0;
      int maxCount = 0;
      while (r < s.length()) {
         int windowSize = r - l + 1;
         // Increment in hashmap
         map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
         for (Map.Entry<Character, Integer> item : map.entrySet()) {
            int count = item.getValue();
            maxCount = Math.max(maxCount, count);
         }
         if (windowSize - maxCount <= k) {
            maxLength = Math.max(maxLength, windowSize);
            r++;
         } else {
            map.remove(s.charAt(l));
            l++;
         }
      }

      return maxLength;
   }
}
