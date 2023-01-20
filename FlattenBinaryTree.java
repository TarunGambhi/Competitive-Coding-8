//https://leetcode.com/problems/flatten-binary-tree-to-linked-list
//TC :o(n)
//SC:o(h)

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
    TreeNode prevNode = null;
    TreeNode next = null;
    public void flatten(TreeNode root) {
        if(root == null) return;
        dfs(root);
    }
    private void dfs(TreeNode root){
        
        //base
        if(root == null) return;
        //logic
        
        if(root.right != null)
            dfs(root.right);//5
        if(root.left != null)
            dfs(root.left);
                
        if(prevNode != null){
            root.right = prevNode;
            root.left = null;
        }
        prevNode = root;
    }
}
