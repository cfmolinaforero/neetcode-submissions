// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public void quickSortRec(List<Pair> pairs, int s, int e) {
      if (e - s + 1 <= 1)
         return;

      int l = s;
      Pair pivot = pairs.get(e);

      for (int r = s; r < e; r++) {
         if (pairs.get(r).key < pivot.key) {
            // swap l and r elements
            Pair temp = pairs.get(l);
            pairs.set(l, pairs.get(r));
            pairs.set(r, temp);
            l++;
         }
      }

      // swap l and pivot elements
      pairs.set(e, pairs.get(l));
      pairs.set(l, pivot);

      quickSortRec(pairs, s, l - 1);
      quickSortRec(pairs, l + 1, e);
   }

   public List<Pair> quickSort(List<Pair> pairs) {
      quickSortRec(pairs, 0, pairs.size() - 1);
      return pairs;
   }
}
