package Tree;

// 652. Find Duplicate Subtrees

// Given the root of a binary tree, return all duplicate subtrees.
// For each kind of duplicate subtrees, you only need to return the root node of any one of them.
// Two trees are duplicate if they have the same structure with the same node values.


import java.util.ArrayList;
import java.util.List;

public class FindDuplicateSubtrees {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    public TreeNode helper(TreeNode root, List<TreeNode> list){
        if(root==null) return null;
        List<TreeNode> newList = new ArrayList<>(list);
        TreeNode leftNode = helper(root.left, list);
        TreeNode rightNode = helper(root.right, newList);
        if(leftNode!=null && rightNode!=null){
            if(leftNode.val==rightNode.val){
                list.add(root.right);
            }
        }
        return root;
    }
}
