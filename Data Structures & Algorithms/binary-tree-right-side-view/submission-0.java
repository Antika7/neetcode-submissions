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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> output = new ArrayList<>();

        if (root == null) return output;
        
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()) {

            int qLen = q.size();

            for(int i=q.size(); i>0; i--) {

                System.out.println("\ni=" + i + " & q.size()=" + q.size() + " & qLen=" + qLen);
                
                TreeNode currNode = q.poll();

                if (currNode.left != null) {
                    q.offer(currNode.left);
                }

                if (currNode.right != null) {
                    q.offer(currNode.right);
                }
                
                if(i == 1) {
                    System.out.println("Adding to output = "+ currNode.val);
                    output.add(currNode.val);
                }
            }
        }

        return output;

    }
}
