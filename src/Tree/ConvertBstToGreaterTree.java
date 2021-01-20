package Tree;

// 538. Convert BST to Greater Tree

// Given the root of a Binary Search Tree (BST), convert it to a Greater Tree
// such that every key of the original BST is changed to the original key
// plus sum of all keys greater than the original key in BST.
//
// As a reminder, a binary search tree is a tree that satisfies these constraints:
//        The left subtree of a node contains only nodes with keys less than the node's key.
//        The right subtree of a node contains only nodes with keys greater than the node's key.
//        Both the left and right subtrees must also be binary search trees.


public class ConvertBstToGreaterTree {
    public TreeNode convertBST(TreeNode root) {
        return helper(root);
    }

    int sum = 0;
    public TreeNode helper(TreeNode root){
        if(root==null) return null;
        helper(root.right);
        sum = sum + root.val;
        root.val = sum;
        helper(root.left);
        return root;
    }
}
