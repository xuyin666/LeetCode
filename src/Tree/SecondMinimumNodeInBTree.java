package Tree;

// 671. Second Minimum Node In a Binary Tree

// Given a non-empty special binary tree consisting of nodes with the non-negative value,
// where each node in this tree has exactly two or zero sub-node.
// If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes.
// More formally, the property root.val = min(root.left.val, root.right.val) always holds.
// Given such a binary tree, you need to output the second minimum value
// in the set made of all the nodes' value in the whole tree.
// If no such second minimum value exists, output -1 instead.

import java.util.*;

public class SecondMinimumNodeInBTree {
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> aList = new ArrayList<>();
        helper(root, aList);
        if(aList.size()==1){
            return -1;
        }
        Collections.sort(aList);
        return aList.get(1);
    }

    public void helper(TreeNode root, List<Integer> aList){
        if(root==null) return;
        helper(root.left, aList);
        if(!aList.contains(root.val))
            aList.add(root.val);
        helper(root.right, aList);
    }
}
