package Tree;

public class BTreeInorderPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }

    public TreeNode helper(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd){
        if(inStart>inEnd || postStart>postEnd) return null;
        if(inStart==inEnd || postStart==postEnd) return new TreeNode(postorder[postEnd]);
        int index = inStart;
        while(inorder[index] != postorder[postEnd]){
            index++;
        }
        int rightTreelen = inEnd - index;
        TreeNode leftNode = helper(inorder, inStart, index-1, postorder, postStart, postEnd-rightTreelen-1);
        TreeNode rightNode = helper(inorder, index+1, inEnd, postorder, postEnd-rightTreelen, postEnd-1);
        return new TreeNode(postorder[postEnd], leftNode, rightNode);
    }

}
