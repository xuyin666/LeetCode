package Tree;

//Given a binary tree, determine if it is height-balanced.
//        For this problem, a height-balanced binary tree is defined as:
//        a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

public class BalancedBTree {
    public boolean isBalanced(TreeNode root) {
        return helper(root);
    }

    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public boolean helper(TreeNode root){
        if(root==null) return true;
        return Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1 && helper(root.left) && helper(root.right);
    }
}
