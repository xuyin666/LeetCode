package Tree;

// 563. Binary Tree Tilt
// Given the root of a binary tree, return the sum of every tree node's tilt.
// The tilt of a tree node is the absolute difference
// between the sum of all left subtree node values and all right subtree node values.
// If a node does not have a left child, then the sum of the left subtree node values is treated as 0.
// The rule is similar if there the node does not have a right child.


public class BTreeTilt {
    int sum = 0;

    public int findTilt(TreeNode root) {
        if(root==null) return 0;
        sumNode(root);
        return sum;
    }

    public int sumNode(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) {
            sum = sum + 0;
            return root.val;
        } else if (root.left!=null){
            sum = sum + Math.abs(sumNode(root.left));
            return root.val + sumNode(root.left);
        } else if(root.right!=null){
            sum = sum + Math.abs(sumNode(root.right));
            return root.val + sumNode(root.right);
        }
        int leftVal = sumNode(root.left);
        int rightVal = sumNode(root.right);
        sum = sum + Math.abs(leftVal - rightVal);
        return leftVal+rightVal+root.val;
    }
}
