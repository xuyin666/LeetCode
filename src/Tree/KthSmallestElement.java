package Tree;

// 230. Kth Smallest Element in a BST
// Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class KthSmallestElement {
//    Recursive
//    public int kthSmallest(TreeNode root, int k) {
//        List<Integer> aList = new ArrayList<>();
//        if(root==null) return -1;
//        dfs(root, aList);
//        if(k<=0 || k> aList.size()){
//            return -1;
//        }
//        return aList.get(k-1);
//    }
//
//    public void dfs(TreeNode node, List<Integer> aList){
//        if(node==null){
//            return;
//        }else{
//            dfs(node.left, aList);
//            aList.add(node.val);
//            dfs(node.right, aList);
//        }
//    }

//    iterate
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        Stack<TreeNode> qStack = new Stack<>();
        pushAllLeft(root, qStack);
        while(!qStack.isEmpty()){
            TreeNode aNode = qStack.pop();
            int val = aNode.val;
            if(k==1)
                return val;
            if(aNode.right!=null)
                pushAllLeft(aNode.right, qStack);
            k=k-1;
        }
        return -1;
    }

    public void pushAllLeft(TreeNode root, Stack<TreeNode> qStack){
        if(root==null) return;
        while(root!=null){
            qStack.add(root);
            root = root.left;
        }
        return;
    }
}
