class Solution {
   public String encode(List<String> strs) {
      String encoded = "";
      for (String str : strs) {
         if (str == "")
            return "";
         encoded += str;
         encoded += "_";
      }
      return encoded;
   }

   public List<String> decode(String str) {
      String[] strs = str.split("_");
      List<String> res = new ArrayList<>();
      if (str == "") {
         res.add("");
         return res;
      }
      for (int i = 0; i < strs.length; i++) {
         res.add(strs[i]);
      }

      return res;
   }
}
