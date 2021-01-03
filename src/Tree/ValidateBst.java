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
//    public boolean isValidBST(TreeNode root) {
//        Stack<TreeNode> stackNode = new Stack<>();
//        if(root == null) return true;
//        pushAllLeft(root, stackNode);
//        TreeNode prev = null;
//        TreeNode curr = null;
//        while(!stackNode.isEmpty()){
//             curr = stackNode.pop();
//             if (prev != null && prev.val >= curr.val) return false;
//             prev = curr;
//             pushAllLeft(curr.right, stackNode);
//        }
//        return true;
//
//    }
//
//    public void pushAllLeft(TreeNode root, Stack<TreeNode> stackNode){
//        while(root != null){
//            stackNode.push(root);
//            root = root.left;
//        }
//    }

    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, Long.MIN_VALUE, root.val) && helper(root.right, root.val, Long.MAX_VALUE);
    }

    public boolean helper(TreeNode root, long min_v, long max_v){
        if (root==null) return true;
        if(root.val <= min_v || root.val >= max_v) return false;
        else{
            return helper(root.left, min_v, root.val) && helper(root.right, root.val, max_v);
        }
    }



}
