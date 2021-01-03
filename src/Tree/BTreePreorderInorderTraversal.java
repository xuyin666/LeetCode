package Tree;

//Given preorder and inorder traversal of a tree, construct the binary tree.

public class BTreePreorderInorderTraversal {
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        return helper(preorder,inorder);
//    }
//
//    public TreeNode helper(int[] preorder, int[] inorder){
//        if(preorder.length==0 || inorder.length==0) return null;
//        if(inorder.length==1) return new TreeNode(preorder[0]);
//        int index = 0;
//        while(inorder[index]!=preorder[0]){
//            index++;
//        }
//        int[] newPre = new int[index];
//        int[] newIn = new int[index];
//        int[] newPre1 = new int[inorder.length-1-index];
//        int[] newIn1 = new int[inorder.length-1-index];
//        for(int i=0; i<index; i++){
//            newPre[i] = preorder[i+1];
//        }
//        for(int i=0; i<index; i++){
//            newIn[i] = inorder[i];
//        }
//        for(int i=0; i<inorder.length-1-index; i++){
//            newPre1[i] = preorder[index+1+i];
//        }
//
//        for(int i=0; i<inorder.length-1-index; i++){
//            newIn1[i] = inorder[index+1+i];
//        }
//
//        TreeNode leftNode = helper(newPre, newIn);
//        TreeNode rightNode = helper(newPre1, newIn1);
//        return new TreeNode(inorder[index], leftNode, rightNode);
//    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,0, preorder.length-1,inorder,0, inorder.length-1);
    }

    public TreeNode helper(int[] preorder,int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
        if(preStart > preEnd || inStart > inEnd) return null;
        if(preStart == preEnd || inStart == inEnd) return new TreeNode(preorder[preStart]);
        int index = inStart;
        while(inorder[index]!=preorder[preStart]){
            index++;
        }
        int leftTreeLen = index - inStart;
//        TreeNode leftNode = helper(preorder, preStart+1, preStart+leftTreeLen, inorder, inStart, index-1);
//        TreeNode rightNode = helper(preorder, preStart+leftTreeLen+1, preEnd, inorder, index+1, inEnd);
        // 1 2 4 5 6
        // 4 2 5 1 6
        TreeNode leftNode = helper(preorder, preStart+1, preStart+leftTreeLen, inorder, inStart, index-1);
        TreeNode rightNode = helper(preorder, preStart+leftTreeLen+1, preEnd, inorder, index+1, inEnd);


        return new TreeNode(inorder[index], leftNode, rightNode);
    }
}
