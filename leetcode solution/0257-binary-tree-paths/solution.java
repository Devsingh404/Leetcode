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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> answer = new ArrayList<String>();
        helper(root,answer,"");
        return answer;

    }

     void helper(TreeNode root, List<String> answer, String ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            ans=ans+root.val;
            answer.add(ans);
            return;
        }
        helper(root.left,answer,ans+root.val+"->");
        helper(root.right,answer,ans+root.val+"->");
    }
}
