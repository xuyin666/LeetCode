package Tree;

// 617. Merge Two Binary Trees

// Given two binary trees and imagine that when you put one of them to cover the other,
// some nodes of the two trees are overlapped while the others are not.
// You need to merge them into a new binary tree.
// The merge rule is that if two nodes overlap,
// then sum node values up as the new value of the merged node.
// Otherwise, the NOT null node will be used as the node of new tree.

public class MergeTwoBTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return helper(t1, t2);
    }

    public TreeNode helper(TreeNode t1, TreeNode t2){
        if(t1==null && t2==null) return null;
        else if(t1==null){
            return t2;
        }else if(t2==null){
            return t1;
        }else{
            TreeNode aNode = new TreeNode( t1.val + t2.val);
            aNode.left = helper(t1.left, t2.left);
            aNode.right = helper(t1.right, t2.right);
            return aNode;
        }
    }
}
