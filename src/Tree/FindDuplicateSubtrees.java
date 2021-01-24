package Tree;

// 652. Find Duplicate Subtrees

// Given the root of a binary tree, return all duplicate subtrees.
// For each kind of duplicate subtrees, you only need to return the root node of any one of them.
// Two trees are duplicate if they have the same structure with the same node values.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicateSubtrees {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        helper(root, hashMap, list);
        return list;
    }

    public String helper(TreeNode root, HashMap<String, Integer> hashMap, List<TreeNode> list){
        if(root==null) return "#";
        String serial = root.val + "," + helper(root.left, hashMap, list) + "," + helper(root.right, hashMap, list);
        hashMap.put(serial, hashMap.getOrDefault(serial, 0)+1);
        if(hashMap.get(serial)==2){
            list.add(root);
        }
        return serial;
    }
}
