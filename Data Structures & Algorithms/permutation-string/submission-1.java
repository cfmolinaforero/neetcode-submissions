class Solution {
    static boolean checkInclusion(String s1, String s2) {
      HashMap<Character, Integer> map1 = new HashMap<>();
      HashMap<Character, Integer> map2 = new HashMap<>();
      for (int i = 0; i < s1.length(); i++) {
         Character c1 = s1.charAt(i);
         map1.put(c1, map1.getOrDefault(c1, 0) + 1);
      }

      for (int i = 0; i < s1.length() - 1; i++) {
         Character c2 = s2.charAt(i);
         map2.put(c2, map2.getOrDefault(c2, 0) + 1);
      }

      for (int r = s1.length() - 1; r < s2.length(); r++) {
         Character c2 = s2.charAt(r);
         map2.put(c2, map2.getOrDefault(c2, 0) + 1);

         if (map1.equals(map2))
            return true;

         Character lc = s2.charAt(r - s1.length() + 1);
         if (map2.get(lc) == 1)
            map2.remove(lc);
         else
            map2.put(lc, map2.getOrDefault(lc, 0) - 1);
      }

      return false;
   }
}
