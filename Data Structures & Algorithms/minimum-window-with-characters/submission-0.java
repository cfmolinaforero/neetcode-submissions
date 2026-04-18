class Solution {
    static String minWindow(String s, String t) {
      if (s == null || t == null || s.length() < t.length())
         return "";

      Map<Character, Integer> tMap = new HashMap<>();
      for (char c : t.toCharArray()) {
         tMap.put(c, tMap.getOrDefault(c, 0) + 1);
      }

      Map<Character, Integer> window = new HashMap<>();
      int have = 0, need = tMap.size();
      int l = 0, minLen = Integer.MAX_VALUE, minStart = 0;

      for (int r = 0; r < s.length(); r++) {
         char c = s.charAt(r);
         window.put(c, window.getOrDefault(c, 0) + 1);

         if (tMap.containsKey(c) && window.get(c).intValue() == tMap.get(c).intValue()) {
            have++;
         }

         while (have == need) {
            if (r - l + 1 < minLen) {
               minLen = r - l + 1;
               minStart = l;
            }

            char leftChar = s.charAt(l);
            window.put(leftChar, window.get(leftChar) - 1);
            if (tMap.containsKey(leftChar) && window.get(leftChar).intValue() < tMap.get(leftChar).intValue()) {
               have--;
            }
            l++;
         }
      }

      return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
   }
}
