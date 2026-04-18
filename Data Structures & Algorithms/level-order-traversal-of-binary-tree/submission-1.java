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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<TreeNode>();

        if (root != null) q.add(root);

        while (!q.isEmpty()) {
            int count = q.size();
            List<Integer> sublist = new ArrayList<>();

            for (int i = 0; i < count; i++) {
                TreeNode curr = q.poll();

                sublist.add(curr.val);

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            traversal.add(sublist);
        }

        return traversal;
    }
}
