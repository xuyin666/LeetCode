package Tree;

// 515. Find Largest Value in Each Tree Row
// Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEachTreeRow {
//    iterative
//    public List<Integer> largestValues(TreeNode root) {
//        Queue<TreeNode> nodeQueue = new LinkedList<>();
//        List<Integer> aList = new ArrayList<>();
//        if(root==null) return aList;
//        nodeQueue.add(root);
//        while(!nodeQueue.isEmpty()){
//            int size = nodeQueue.size();
//            int max = Integer.MIN_VALUE;
//            for(int i=0; i<size; i++){
//                TreeNode aNode = nodeQueue.remove();
//                if(aNode.val > max)
//                    max = aNode.val;
//                if(aNode.left!=null)
//                    nodeQueue.add(aNode.left);
//                if(aNode.right!=null)
//                    nodeQueue.add(aNode.right);
//            }
//            aList.add(max);
//        }
//        return aList;
//    }

    // recursive
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> aList = new ArrayList<>();
        if(root==null) return aList;
        dfs(root, aList, 0);
        return aList;
    }

    public void dfs(TreeNode root, List<Integer> aList, int depth){
        if(root==null) return;
        if(depth==aList.size()){
            aList.add(root.val);
        }else{
            aList.set(depth, Math.max(aList.get(depth), root.val));
        }
        dfs(root.left, aList, depth+1);
        dfs(root.right, aList, depth+1);
    }
}
