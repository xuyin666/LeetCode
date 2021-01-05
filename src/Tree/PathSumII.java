package Tree;

import java.util.ArrayList;
import java.util.List;
// 113. Path Sum II
// Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        return helper(list, arr, root, sum);

    }

    public List<List<Integer>> helper(List<List<Integer>> list, List<Integer> arr, TreeNode root, int sum){
        if(root==null) return null;
        if(root.left==null && root.right==null && root.val == sum) {
            arr.add(root.val);
            list.add(arr);
            return list;
        }
        if(root.left!=null){
            arr.add(root.val);
            helper(list, new ArrayList<>(arr), root.left, sum-root.val);
            arr.remove(arr.size()-1);
        }
        if(root.right!=null){
            arr.add(root.val);
            helper(list, new ArrayList<>(arr), root.right, sum-root.val);
            arr.remove(arr.size()-1);
        }

        return list;
    }

}
