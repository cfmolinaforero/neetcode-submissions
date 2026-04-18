class Solution {
   /**
    * Groups words that are anagrams of each other.
    * 
    * Example:
    * Input: ["act","pots","tops","cat","stop","hat"]
    * Output: [["hat"], ["act", "cat"], ["pots", "tops", "stop"]]
    */
   public List<List<String>> groupAnagrams(String[] words) {
      Map<String, List<String>> anagramGroups = new HashMap<>();

      for (String word : words) {
         int[] charsCount = new int[26];

         for (Character c : word.toCharArray()) {
            charsCount[c - 'a']++;
         }

         String signature = Arrays.toString(charsCount);

         anagramGroups.computeIfAbsent(signature, k -> new ArrayList<>()).add(word);
      }

      return new ArrayList<>(anagramGroups.values());
   }
}
