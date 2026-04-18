// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
      List<List<Pair>> res = new ArrayList<>();

      for (int i = 0; i < pairs.size(); i++) {
         Pair pair = pairs.get(i);
         int key = pair.key;
         int j = i - 1;
         while (j >= 0 && pairs.get(j).key > key) {
            pairs.set(j + 1, pairs.get(j));
            j--;
         }
         pairs.set(j + 1, pair);

         List<Pair> clone = new ArrayList<Pair>(pairs);
         res.add(clone);
      }

      return res;
   }
}
