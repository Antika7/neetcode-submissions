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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(subRoot == null) return true;

        if(root == null) return false;

        if(sameTree(root, subRoot) == true) return true;

        return (isSubtree(root.right, subRoot) || isSubtree(root.left, subRoot));

    }

    private boolean sameTree(TreeNode root, TreeNode subRoot) {

        if(root==null && subRoot==null) return true;

        if(root!=null && subRoot!=null && root.val == subRoot.val) {
            return (sameTree(root.right, subRoot.right) && sameTree(root.left, subRoot.left));
        }

        return false;
    }


}
