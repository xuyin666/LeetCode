package Tree;

//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
//
//        For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

import java.util.Stack;

public class SymmetricTree {
    // recursif
//    public boolean isSymmetric(TreeNode root) {
//        if(root == null) return true;
//        return SymmetricHelp(root.left, root.right);
//    }
//
//    public boolean SymmetricHelp(TreeNode leftNode, TreeNode rightNode){
//        if (leftNode == null && rightNode == null) return true;
//        else if (leftNode == null || rightNode == null) return false;
//        if (leftNode.val == rightNode.val){
//            return SymmetricHelp(leftNode.left, rightNode.right) && SymmetricHelp(leftNode.right, rightNode.left);
//        }
//        return false;
//    }

    public boolean isSymmetic(TreeNode root){
        Stack<TreeNode> stackNode = new Stack<>();
        if(root==null) return true;
        stackNode.push(root.left);
        stackNode.push(root.right);
        while(!stackNode.empty()){
            // n1= rightNode
            TreeNode n1 = stackNode.pop();
            // n2= leftNode
            TreeNode n2 = stackNode.pop();
            if(n1 == null && n2==null) continue;
            if(n1==null || n2==null || n1.val != n2.val) return false;
            stackNode.push(n1.left);
            stackNode.push(n2.right);
            stackNode.push(n1.right);
            stackNode.push(n2.left);
        }
        return true;

    }
}
