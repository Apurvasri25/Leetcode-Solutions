class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Base case
        if (root == null) return false;

        // If leaf node, check sum
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        // Recur for left and right subtree
        return hasPathSum(root.left, targetSum - root.val) ||
               hasPathSum(root.right, targetSum - root.val);
    }
}
