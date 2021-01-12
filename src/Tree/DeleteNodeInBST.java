package Tree;

// 450. Delete Node in a BST

// Given a root node reference of a BST and a key, delete the node with the given key in the BST.
// Return the root node reference (possibly updated) of the BST.
// Basically, the deletion can be divided into two stages:
// Search for a node to remove.
// If the node is found, delete the node.
// Follow up: Can you solve it with time complexity O(height of tree)?

import jdk.nashorn.api.tree.Tree;

import javax.swing.plaf.multi.MultiColorChooserUI;

public class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;

        // compare the key with the root.val
        // check which side we should go
        if(root.val < key){
            root.right = deleteNode(root.right, key);
            return root;
        }else if(root.val > key){
            root.left = deleteNode(root.left, key);
            return root;
        }

        // if root.val == key
        // the root has one child or no child
        if(root.left==null && root.right==null){
            return null;
        }else if (root.left==null){
            return root.right;
        }else if(root.right==null){
            return root.left;
        }
        if(root.right.left==null){
            root.right.left = root.left;
            return root.right;
        }
        else {
            TreeNode aNode = findMinRight(root.right);
            aNode.left = root.left;
            aNode.right = root.right;
            return aNode;
        }

    }

    public TreeNode findMinRight(TreeNode treeNode){
        TreeNode curr = treeNode;
        TreeNode prev = null;
        while(curr.left!=null){
            prev = curr;
            curr = curr.left;
        }
        prev.left = curr.right;
        return curr;
    }


}
