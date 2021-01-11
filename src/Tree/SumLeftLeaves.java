package Tree;

// 404. Sum of Left Leaves
// Find the sum of all left leaves in a given binary tree.

public class SumLeftLeaves {
//    recursive 0
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root, false);
    }

    public int helper(TreeNode root, Boolean isLeft){
        if(root==null) return 0;
        if(root.left==null && root.right==null && isLeft) return root.val;
        return helper(root.left, true) + helper(root.right, false);
    }

// recursive 1

// iterative 0
}

