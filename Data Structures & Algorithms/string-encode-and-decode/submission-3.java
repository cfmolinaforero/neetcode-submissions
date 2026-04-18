class Solution {
   public static String encode(List<String> strs) {
      StringBuilder encoded = new StringBuilder();
      for (String s : strs) {
         encoded.append(s.length()).append("#").append(s);
      }
      return encoded.toString();
   }

   public static List<String> decode(String str) {
      List<String> res = new ArrayList<>();

      int index = 0;
      while (index < str.length()) {
         int indexOfHashtag = str.indexOf("#", index);
         int length = Integer.parseInt(str.substring(index, indexOfHashtag));
         String word = str.substring(indexOfHashtag + 1, indexOfHashtag + length + 1);
         res.add(word);

         index = indexOfHashtag + length + 1;
      }

      return res;
   }
}
