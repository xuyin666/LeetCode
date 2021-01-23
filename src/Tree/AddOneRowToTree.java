package Tree;

// 623. Add One Row to Tree

// Given the root of a binary tree, then value v and depth d,
// you need to add a row of nodes with value v at the given depth d. The root node is at depth 1.

// The adding rule is: given a positive integer depth d,
// for each NOT null tree nodes N in depth d-1,
// create two tree nodes with value v as N's left subtree root and right subtree root.
// And N's original left subtree should be the left subtree of the new left subtree root,
// its original right subtree should be the right subtree of the new right subtree root.
// If depth d is 1 that means there is no depth d-1 at all,
// then create a tree node with value v as the new root of the whole original tree,
// and the original tree is the new root's left subtree.

import java.util.LinkedList;
import java.util.Queue;

public class AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1) {
            TreeNode aNode = new TreeNode(v);
            aNode.left = root;
            return aNode;
        }
        helper(root, v, d, 1);
        return root;
    }

    public void helper(TreeNode node, int v, int d, int curr){
        if(node==null)
            return;
        if(curr == d-1){
            TreeNode tmp = node.left;
            node.left = new TreeNode(v);
            node.left.left = tmp;

            tmp = node.right;
            node.right = new TreeNode(v);
            node.right.right = tmp;
            return;
        }

        helper(node.left, v, d, curr+1);
        helper(node.right, v, d, curr+1);
    }
}
