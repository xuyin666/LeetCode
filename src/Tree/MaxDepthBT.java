package Tree;

import jdk.nashorn.api.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Given the root of a binary tree, return its maximum depth.

public class MaxDepthBT {
//    public int maxDepth(TreeNode root) {
//        if(root == null) return 0;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//        int depth = 0;
//        while(!q.isEmpty()){
//            int sizeq = q.size();
//            for(int i=0; i<sizeq; i++){
//                TreeNode newNode = q.remove();
//                if(newNode.left!=null) q.add(newNode.left);
//                if(newNode.right!=null) q.add(newNode.right);
//            }
//            depth += 1;
//        }
//        return depth;
//    }

//    public int maxDepth(TreeNode root) {
//        if(root==null) return 0;
//        else return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
//    }

    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        Stack<TreeNode> stackNode = new Stack<>();
        Stack<Integer> depthStack = new Stack<>();
        int depth = 0;
        while(root!=null){
            depth = depth+1;
            stackNode.push(root);
            depthStack.push(depth);
            root = root.left;
        }
        int max = 0;
        while(!stackNode.isEmpty()){
            TreeNode curr = stackNode.pop();
            TreeNode rightNode = curr.right;
            depth = depthStack.pop();
            while(rightNode!=null){
                depth = depth + 1;
                stackNode.push(rightNode);
                depthStack.push(depth);
                rightNode = rightNode.left;
            }

            if(depth>max) max=depth;
        }
        return max;
    }

}
