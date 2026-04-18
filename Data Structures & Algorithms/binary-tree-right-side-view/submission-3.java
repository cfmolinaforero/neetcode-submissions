/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
      List<Integer> list = new ArrayList<Integer>();
      Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
      if (root != null)
         queue.add(root);

      // bfs
      while (!queue.isEmpty()) {
         list.add(queue.peek().val);
         int count = queue.size();

         for (int i = 0; i < count; i++) {
            TreeNode curr = queue.poll();

            if (curr.right != null) {
               queue.add(curr.right);
            }

            if (curr.left != null) {
               queue.add(curr.left);
            }
         }
      }

      return list;
   }
}
