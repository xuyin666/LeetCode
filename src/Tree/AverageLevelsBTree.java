package Tree;

// 637. Average of Levels in Binary Tree

// Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevelsBTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> aList = new ArrayList<>();
        if(root==null) return aList;
        Queue<TreeNode> aQueue = new LinkedList<>();
        aQueue.add(root);
        while(!aQueue.isEmpty()){
            int size = aQueue.size();
            int i=0;
            double sum = 0.0;
            while(i<size){
                TreeNode aNode = aQueue.poll();
                sum = sum + aNode.val;
                if(aNode.left!=null){
                    aQueue.add(aNode.left);
                }
                if(aNode.right!=null){
                    aQueue.add(aNode.right);
                }
                i++;
            }
            double average = sum / size;
            aList.add(average);

        }
        return aList;
    }

}
