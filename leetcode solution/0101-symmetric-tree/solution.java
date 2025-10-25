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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        return helper(root.left,root.right);
    }

    public boolean helper(TreeNode L , TreeNode R){
        if(L==null && R==null) return true;
        if(L==null && R !=null) return false;
        if(L!=null && R ==null) return false;
        if(L.val != R.val) return false;
        boolean res1 = helper(L.left , R.right);
        boolean res2 = helper(L.right , R.left);
        return(res1==true && res2==true);
    }
}
