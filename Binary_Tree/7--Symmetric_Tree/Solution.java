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
    public boolean isSymmetric(TreeNode root) {

        return isSym(root.left, root.right);    
    }

    public boolean isSym(TreeNode l, TreeNode r)
    {
        if(l!= null && r!= null)
        {
            if(l.val == r.val && res )
            {
                res = true;
                isSym(l.left, r.right);
                isSym(l.right, r.left);
            }
            else
                res = false;
        }
        else if(l== null && r!= null  || l!= null && r== null)
            res = false;
        
        return res;
    }
}