//https://leetcode.com/problems/diameter-of-binary-tree/
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
    int maxDia;
    public int diameterOfBinaryTree(TreeNode root) {
       maxDia=0;
       height(root);
       return maxDia; 
    }

    public int height(TreeNode root){
        if(root==null) return -1;
        int left=height(root.left);
        int right=height(root.right);
        int h=1+Math.max(left,right);
        maxDia=Math.max(2+left+right,maxDia);
        return h;
    }
}
