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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nums = new ArrayList<Integer>();
        if (root == null) return nums;
        inorderTraversalRec(root, nums);
        return nums;
    }

    public void inorderTraversalRec(TreeNode root, List<Integer> nums) {
        if (root == null) return;
        inorderTraversalRec(root.left, nums);
        nums.add(root.val);
        inorderTraversalRec(root.right, nums);
    }
}