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
        if(d==1) return new TreeNode(v);
        if(root == null) return null;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        int curr = 2;
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()){
            int size = nodeQueue.size();
            int i = 0;
            while(i < size){
                TreeNode aNode = nodeQueue.remove();

                if(aNode.left!=null){
                    TreeNode leftNode = aNode.left;
                    if(curr == d){
                        aNode.left = new TreeNode(v);
                        aNode.left.left = leftNode;
                    }
                    nodeQueue.add(leftNode);
                }
                if(aNode.right!=null){
                    TreeNode rightNode = aNode.right;
                    if(curr == d){
                        aNode.right = new TreeNode(v);
                        aNode.right.right = rightNode;
                    }
                    nodeQueue.add(rightNode);
                }
            }
            if(curr == d )
                return root;
            curr = curr+1;
        }
        return null;
    }
}
