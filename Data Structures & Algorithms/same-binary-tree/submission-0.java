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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean[] areSame = new boolean[1];
        areSame[0] = true;
        dfs(p, q, areSame);
        return areSame[0];
    }

    private void dfs(TreeNode p, TreeNode q, boolean[] areSame) {
        if(p == null && q == null) {
            return;
        } else if(p == null && q != null) {
            areSame[0] = false;
            return;
        } else if(p != null && q == null) {
            areSame[0] = false;
            return;
        }


        if(p.val != q.val) {
            areSame[0] = false;
        }
        dfs(p.left, q.left, areSame);
        dfs(p.right, q.right, areSame);
        return;

    }
}
