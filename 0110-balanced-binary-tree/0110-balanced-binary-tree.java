class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
    
    private int height(TreeNode node) {
        if (node == null) return 0;
        
        int leftHeight = height(node.left);
        if (leftHeight == -1) return -1; // left subtree not balanced
        
        int rightHeight = height(node.right);
        if (rightHeight == -1) return -1; // right subtree not balanced
        
        if (Math.abs(leftHeight - rightHeight) > 1) return -1; // current node unbalanced
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
