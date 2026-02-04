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
    public int findTilt(TreeNode root) {
        
        int arr[] = new int[1];
        int x = fn(root ,arr);
        return arr[0];
    }
    public int fn(TreeNode root, int arr []){

        if(root == null){
            return 0; 
        }

        int lsum = fn(root.left , arr);
        int rsum = fn(root.right , arr);

        arr[0]+= Math.abs(lsum - rsum);
        return lsum+rsum+root.val;
    }
}