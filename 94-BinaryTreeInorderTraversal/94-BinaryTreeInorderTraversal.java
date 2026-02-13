// Last updated: 2/13/2026, 11:23:56 AM
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
     ArrayList<Integer>  ll=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
       
        if(root!=null){
            inorderTraversal(root.left);
            ll.add(root.val);
            inorderTraversal(root.right);
        }
        return ll;
    }
}