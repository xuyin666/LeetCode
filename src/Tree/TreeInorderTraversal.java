package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


// Given the root of a binary tree, return the inorder traversal of its nodes' values.

public class TreeInorderTraversal {

//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        list = help(root, list);
//        return list;
//    }
//
//    public List<Integer> help(TreeNode root, List<Integer> list){
//        if(root==null) return list;
//        else{
//            help(root.left, list);
//            list.add(root.val);
//            help(root.right, list);
//        }
//        return list;
//    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stackNode = new Stack<>();
        if(root==null) return list;
        pushAllLeft(root, stackNode);
        while(!stackNode.isEmpty()){
            TreeNode curr = stackNode.pop();
            list.add(curr.val);
            pushAllLeft(curr.right, stackNode);
        }
        return list;
    }

    public void pushAllLeft(TreeNode root, Stack<TreeNode> stackNode){
        while(root!=null){
            stackNode.push(root);
            root = root.left;
        }
    }
}
