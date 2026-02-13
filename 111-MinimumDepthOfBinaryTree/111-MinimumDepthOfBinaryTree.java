// Last updated: 2/13/2026, 11:23:54 AM
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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int lc=1+minDepth(root.left);
        int rc=1+minDepth(root.right);
        if(lc==1)return rc;
         if(rc==1)return lc;
        return Math.min(lc,rc);
    }
}