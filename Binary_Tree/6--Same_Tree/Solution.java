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
    boolean res = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p== null && q!= null || p!= null && q== null)
            res = false;

        else if( p!= null && q!= null && p.val!= q.val)
        {
            res = false;
        }
        else if(p!= null && q!= null) 
        {
            isSameTree(p.left, q.left);
            isSameTree(p.right, q.right);
        }
        return res;
        
    }
}