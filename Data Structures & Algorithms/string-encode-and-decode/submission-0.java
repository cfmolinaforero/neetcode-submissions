class Solution {
   public String encode(List<String> strs) {
      String encoded = "";
      for (String str : strs) {
         encoded += str;
         encoded += " ";
      }
      return encoded;
   }

   public List<String> decode(String str) {
      String[] strs = str.split(" ");
      List<String> res = new ArrayList<>();
      for (int i = 0; i < strs.length; i++) {
         res.add(strs[i]);
      }

      return res;
   }
}
