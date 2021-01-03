package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Given a binary tree, return the zigzag level order traversal of its nodes' values.
// (ie, from left to right, then right to left for the next level and alternate between).
public class BTreeZigzagLOT {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean zigzag = false;
        while(!q.isEmpty()){
            int sizeq = q.size();
            List<Integer> arr = new ArrayList<>();
            for (int i=0; i<sizeq; i++){
                TreeNode newNode = q.remove();
                if(!zigzag)
                    arr.add(newNode.val);
                else
                    arr.add(0, newNode.val);
                if(newNode.left!=null) q.add(newNode.left);
                if(newNode.right!=null) q.add(newNode.right);

            }
            zigzag = !zigzag;
            list.add(arr);
        }
        return list;
    }
}
