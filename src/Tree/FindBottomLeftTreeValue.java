package Tree;

// 513. Find Bottom Left Tree Value
// Given the root of a binary tree, return the leftmost value in the last row of the tree.


import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftTreeValue {
    // the initial
//    public int findBottomLeftValue(TreeNode root) {
//        if(root == null) return 0;
//        Queue<TreeNode> nodeQueue = new LinkedList<>();
//        nodeQueue.add(root);
//        int leftMost = 0;
//        while(!nodeQueue.isEmpty()){
//            int size = nodeQueue.size();
//            int i;
//            for(i=0; i < size; i++){
//                TreeNode aNode = nodeQueue.remove();
//                if(i==0) leftMost = aNode.val;
//                if(aNode.left!=null) nodeQueue.add(aNode.left);
//                if(aNode.right!=null) nodeQueue.add(aNode.right);
//            }
//        }
//        return leftMost;
//    }

    // the improvement
//    public int findBottomLeftValue(TreeNode root) {
//        if(root==null) return 0;
//        Queue<TreeNode> nodeQueue = new LinkedList<>();
//        nodeQueue.add(root);
//        TreeNode aNode=null;
//        while(!nodeQueue.isEmpty()){
//            int size = nodeQueue.size();
//            for(int i=0; i<size; i++){
//                aNode = nodeQueue.remove();
//                if(aNode.right!=null) nodeQueue.add(aNode.right);
//                if(aNode.left!=null) nodeQueue.add(aNode.left);
//            }
//        }
//        return aNode.val;
//    }

    // the recursive
    int maxDepth = -1;
    int val = 0;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return val;
    }

    public void dfs(TreeNode root, int depth){
        if(root==null) return;
        if(depth > maxDepth){
            maxDepth = depth;
            val = root.val;
        }
        dfs(root.left, depth+1);
        dfs(root.right, depth+1);
    }
}
