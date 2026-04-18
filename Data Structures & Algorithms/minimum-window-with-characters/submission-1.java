class Solution {
    static String minWindow(String s, String t) {
      HashMap<Character, Integer> tMap = new HashMap<>();
      HashMap<Character, Integer> wMap = new HashMap<>();

      for (Character c : t.toCharArray()) {
         tMap.put(c, tMap.getOrDefault(c, 0) + 1);
      }

      int minLength = Integer.MAX_VALUE;
      int[] res = new int[2];

      int l = 0;
      int have = 0, need = tMap.size();
      for (int r = 0; r < s.length(); r++) {
         Character c = s.charAt(r);
         wMap.put(c, wMap.getOrDefault(c, 0) + 1);

         if (tMap.containsKey(c) && tMap.get(c) == wMap.get(c)) {
            have++;
         }

         while (have == need) {
            if (r - l + 1 < minLength) {
               minLength = r - l + 1;
               res[0] = l;
               res[1] = r;
            }

            Character lc = s.charAt(l);
            wMap.put(lc, wMap.get(lc) - 1);

            if (tMap.containsKey(lc) && wMap.get(lc) < tMap.get(lc))
               have--;

            l++;
         }
      }

      return minLength == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
   }
}
