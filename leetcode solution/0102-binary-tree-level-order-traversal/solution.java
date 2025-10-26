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
        List<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        helper(root, 0, list);
        return list;
    }
    void helper(TreeNode root, int height, List<List<Integer>> list){
        if(root==null){
            return;
        }
        if(height==list.size()){
            List<Integer> temp = new ArrayList<Integer>();
            list.add(temp);
        }
        list.get(height).add(root.val);
        helper(root.left, height+1, list);
        helper(root.right, height+1, list);
    }
}
