package Tree;

// 530. Minimum Absolute Difference in BST
// Given a binary search tree with non-negative values,
// find the minimum absolute difference between values of any two nodes.


import java.util.Stack;

public class MinumumAbsoluteDifferenceInBST {
    int min = Integer.MAX_VALUE;
    TreeNode prev = null;

    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return min;
    }

    public void dfs(TreeNode node){
        if(node == null) return;
        dfs(node.left);
        if(prev==null){
            prev = node;
        }else{
            int diff = node.val - prev.val;
            if(min > diff) min = diff;
            prev = node;
        }
        dfs(node.right);
    }
}
