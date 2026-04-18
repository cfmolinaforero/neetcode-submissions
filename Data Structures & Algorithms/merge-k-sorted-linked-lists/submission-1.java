/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    ListNode mergeTwo(ListNode list1, ListNode list2) {
      ListNode mergedList = new ListNode(Integer.MIN_VALUE);

      ListNode curr1 = list1;
      ListNode curr2 = list2;
      ListNode curr3 = mergedList;
      while (curr1 != null && curr2 != null) {
         if (curr1.val <= curr2.val) {
            curr3.next = curr1;
            curr1 = curr1.next;
         } else {
            curr3.next = curr2;
            curr2 = curr2.next;
         }
         curr3 = curr3.next;
      }

      while (curr1 != null) {
         curr3.next = curr1;
         curr1 = curr1.next;
         curr3 = curr3.next;
      }

      while (curr2 != null) {
         curr3.next = curr2;
         curr2 = curr2.next;
         curr3 = curr3.next;
      }

      return mergedList.next;
   }

   public ListNode mergeKLists(ListNode[] lists) {
      if (lists.length <= 1)
         return null;

      ListNode mergedList = lists[0];
      for (int i = 1; i < lists.length; i++) {
         mergedList = mergeTwo(mergedList, lists[i]);
      }

      return mergedList;
   }
}
