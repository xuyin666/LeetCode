package Tree;

// 530. Minimum Absolute Difference in BST
// Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

public class MinumumAbsoluteDifferenceInBST {
    public int getMinimumDifference(TreeNode root) {
        return 0;
    }
    int min = Integer.MAX_VALUE;
    public void helper(TreeNode root){
        if(root.left==null && root.right==null){
            return;
        }
        if(root.left!=null && root.right!=null){
            return;
        }
    }
}
