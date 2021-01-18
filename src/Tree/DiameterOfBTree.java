package Tree;

// 543. Diameter of Binary Tree
// Given a binary tree, you need to compute the length of the diameter of the tree.
// The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
// This path may or may not pass through the root.


public class DiameterOfBTree {
//    public int diameterOfBinaryTree(TreeNode root) {
//        if(root==null)
//            return 0;
//        int sum = maxDepth(root.left) + maxDepth(root.right);
//        int left = diameterOfBinaryTree(root.left);
//        int right = diameterOfBinaryTree(root.right);
//        return Math.max(sum, Math.max(left, right));
//    }
//
//    public int maxDepth (TreeNode root){
//        if(root==null) return 0;
//        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
//    }


    int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        maxDiameter(root);
        return max;
    }

    // maxDiameter: max path length that passes root and almost one of its child
    public int maxDiameter(TreeNode root){
        if(root==null) return 0;
        int l = maxDiameter(root.left);
        int r = maxDiameter(root.right);
        if (l + r > max) max = l+r;
        return Math.max(l, r) + 1 ;
    }

}
