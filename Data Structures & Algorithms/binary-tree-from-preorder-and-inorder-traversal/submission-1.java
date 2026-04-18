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
    private int preorderRootIdx = 0;
   private Map<Integer, Integer> inorderValToIdxMap = new HashMap<Integer, Integer>();

   public TreeNode buildTree(int[] preorder, int[] inorder) {
      for (int i = 0; i < inorder.length; i++)
         inorderValToIdxMap.put(inorder[i], i);

      return buildTreeRec(preorder, 0, inorder.length - 1);
   }

   private TreeNode buildTreeRec(int[] preorder, int leftIdx, int rightIdx) {
      if (leftIdx > rightIdx)
         return null;

      int rootValue = preorder[preorderRootIdx++];
      int inorderRootIdx = inorderValToIdxMap.get(rootValue);

      TreeNode root = new TreeNode(rootValue);
      root.left = buildTreeRec(preorder, leftIdx, inorderRootIdx - 1);
      root.right = buildTreeRec(preorder, inorderRootIdx + 1, rightIdx);
      return root;
   }
}
