package Tree;

// Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTreeLOT {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int sizeq = q.size();
            List<Integer> arr= new ArrayList<>();
            for (int i=0; i< sizeq; i++){
                TreeNode newNode = q.remove();
                arr.add(newNode.val);
                if(newNode.left != null) q.add(newNode.left);
                if(newNode.right != null) q.add(newNode.right);
            }
            list.add(arr);
        }
        return list;
    }

}
