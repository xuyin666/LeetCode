package Tree;

// 662. Maximum Width of Binary Tree

// Given a binary tree, write a function to get the maximum width of the given tree.
// The maximum width of a tree is the maximum width among all levels.
// The width of one level is defined as the length between the end-nodes
// the leftmost and right most non-null nodes in the level,
// where the null nodes between the end-nodes are also counted into the length calculation.
// It is guaranteed that the answer will in the range of 32-bit signed integer.

import java.util.ArrayList;
import java.util.List;

public class MaximumWidthBTree {
    List<Integer> aList;
    public int widthOfBinaryTree(TreeNode root) {
        aList = new ArrayList<>();
        return helper(root, 0, 0);
    }

    public int helper(TreeNode node, int depth, int id){
        if(node==null) return 0;
        if(depth==aList.size()) aList.add(node.val);
        int leftMost = id - aList.get(depth);
        return Math.max(leftMost+1, Math.max(helper(node.left, depth+1, 2*leftMost),
                                            helper(node.right, depth+1, 2*leftMost+1)));
    }
}
