package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 107. Binary Tree Level Order Traversal II
// Given a binary tree, return the bottom-up level order traversal of its nodes' values.
// (ie, from left to right, level by level from leaf to root).

public class BTreeLOTII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()){
            List<Integer> arr = new ArrayList<>();
            int sizeq = nodeQueue.size();
            for(int i=0; i<sizeq; i++){
                TreeNode node = nodeQueue.remove();
                if(node.left!=null) nodeQueue.add(node.left);
                if(node.right!=null) nodeQueue.add(node.right);
                arr.add(node.val);
            }
            res.add(0,arr);
        }
        return res;
    }
}
