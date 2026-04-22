class Solution {
    void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }

   void sortColors(int[] arr) {
      int l = 0, i = 0, r = arr.length - 1;

      while (i < r) {
         if (arr[i] == 0) {
            swap(arr, i, l);
            l++;
         } else if (arr[i] == 2) {
            swap(arr, i, r);
            r--;
            i--;
         }
         i++;
      }
   }
}