class Solution {
   public boolean isAnagram(String s, String t) {
      if (s.length() != t.length())
         return false;

      HashMap<String, Integer> map = new HashMap<String, Integer>();

      for (int i = 0; i < s.length(); i++) {
         String c = Character.toString(s.charAt(i));

         if (map.get(c) == null) {
            map.put(c, 1);
         } else {
            map.put(c, map.get(c) + 1);
         }
      }

      for (int i = 0; i < t.length(); i++) {
         String c = Character.toString(t.charAt(i));
         if (map.get(c) == null)
            return false;
         if (map.get(c) == 0)
            return false;
         else {
            map.put(c, map.get(c) - 1);
         }
      }

      return true;
   }
}
