class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is balanced
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false; // If the current node is not balanced
        }
        
        // Recursively check if the left and right subtrees are balanced
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0; // The height of an empty subtree is 0
            
        }
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
}
