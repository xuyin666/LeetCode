package Tree;

// Given a complete binary tree, count the number of nodes.

//        Definition of a complete binary tree from Wikipedia:
//        In a complete binary tree every level, except possibly the last, is completely filled,
//        and all nodes in the last level are as far left as possible.
//        It can have between 1 and 2h nodes inclusive at the last level h.

public class CountCompleteTreeNode {
//    public int countNodes(TreeNode root) {
//        return helper(root);
//    }
//
//    public int helper(TreeNode root){
//        if(root==null) return 0;
//        return 1+helper(root.left) + helper(root.right);
//    }

    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int ht = height(root);
        int rightHt = height(root.right);
        if(rightHt==ht-1){
            return (int)(Math.pow(2, ht)) + countNodes(root.right);
        }else{
            return (int)(Math.pow(2, ht-1)) + countNodes(root.left);
        }
    }

    public int height(TreeNode root){
        if(root==null) return -1;
        int i = -1;
        while(root!=null){
            root = root.left;
            i = i+1;
        }
        return i;
    }
}
