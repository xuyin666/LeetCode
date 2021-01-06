package Tree;
// 114. Flatten Binary Tree to Linked List
// Given a binary tree, flatten it to a linked list in-place.

public class FlattenBT2LinkedList {
    public void flatten(TreeNode root) {
        helper(root);
    }

    public TreeNode helper(TreeNode root){
        if(root==null) return null;
        TreeNode aNode = root;
        TreeNode rightNode = root.right;
        TreeNode leftNode = root.left;
        if(root.left!=null){
            root.left = null;
            root.right = helper(leftNode);
            aNode = root.right;
            while(aNode.right!=null){
                aNode = aNode.right;
            }
        }
        aNode.right = helper(rightNode);
        return root;
    }
}
