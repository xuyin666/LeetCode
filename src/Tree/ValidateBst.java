package Tree;

//Given the root of a binary tree, determine if it is a valid binary search tree (BST).
//
//        A valid BST is defined as follows:
//
//        The left subtree of a node contains only nodes with keys less than the node's key.
//        The right subtree of a node contains only nodes with keys greater than the node's key.
//        Both the left and right subtrees must also be binary search trees.


import java.util.Stack;

public class ValidateBst {
// iterative
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stackNode = new Stack<>();
        if(root == null) return true;
        pushAllLeft(root, stackNode);
        TreeNode prev = null;
        TreeNode curr = null;
        while(!stackNode.isEmpty()){
             curr = stackNode.pop();
             if (prev != null && prev.val >= curr.val) return false;
             prev = curr;
             pushAllLeft(curr.right, stackNode);
        }
        return true;

    }

    public void pushAllLeft(TreeNode root, Stack<TreeNode> stackNode){
        while(root != null){
            stackNode.push(root);
            root = root.left;
        }
    }



}
