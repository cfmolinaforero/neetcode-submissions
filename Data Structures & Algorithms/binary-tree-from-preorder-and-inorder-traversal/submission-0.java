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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      if (preorder.length == 0)
         return null;
      if (preorder.length == 1)
         return new TreeNode(preorder[0]);

      int rootValue = preorder[0];
      // find index of root in inorder array to determine left and right subtrees
      int rootInorderIndex = 0; // initialized to 0 to avoid compiler error
      for (int i = 0; i < inorder.length; i++) {
         if (inorder[i] == rootValue) {
            rootInorderIndex = i;
            break;
         }
      }
      // Inorder subarrays
      int[] inorderLeftTree = Arrays.copyOfRange(inorder, 0, rootInorderIndex);
      int[] inorderRightTree = Arrays.copyOfRange(inorder, rootInorderIndex + 1, inorder.length);

      int[] preorderLeftTree = Arrays.copyOfRange(preorder, 1, 1 + inorderLeftTree.length);
      int[] preorderRightTree = Arrays.copyOfRange(preorder, 1 + inorderLeftTree.length, preorder.length);

      TreeNode leftTree = buildTree(preorderLeftTree, inorderLeftTree);
      TreeNode rightTree = buildTree(preorderRightTree, inorderRightTree);

      TreeNode rootTree = new TreeNode(rootValue, leftTree, rightTree);

      return rootTree;
   }
}
