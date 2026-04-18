class Solution {
    static int characterReplacement(String s, int k) {
      HashMap<Character, Integer> map = new HashMap<>();
      int maxLength = 0;
      int l = 0;

      for (int r = 0; r < s.length(); r++) {
         map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

         int maxValue = Collections.max(map.values());
         while ((r - l + 1) - maxValue > k) {
            int count = map.get(s.charAt(l));
            if (count == 1)
               map.remove(s.charAt(l));
            else
               map.put(s.charAt(l), count - 1);
            l++;
         }

         maxLength = Math.max(maxLength, r - l + 1);
      }

      return maxLength;
   }
}
