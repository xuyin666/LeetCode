package Tree;

import java.util.HashMap;

// 437. Path Sum III
// You are given a binary tree in which each node contains an integer value.
// Find the number of paths that sum to a given value.
// The path does not need to start or end at the root or a leaf,
// but it must go downwards (traveling only from parent nodes to child nodes).
// The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.

public class PathSumIII {

//    public int pathSum(TreeNode root, int sum) {
//        if(root==null) return 0;
//        return taken(root, sum) + notTaken(root, sum);
//    }
//
//    public int taken(TreeNode root, int sum){
//        if(root==null) return 0;
//        int val = 0;
//        if(sum-root.val==0) val = val+1;
//        return val+taken(root.left, sum-root.val)+taken(root.right, sum-root.val);
//    }
//
//    public int notTaken(TreeNode root, int sum){
//        if(root==null) return 0;
//        return pathSum(root.left, sum) + pathSum(root.right, sum);
//    }

    public int pathSum(TreeNode root, int sum){
        if(root==null) return 0;
        HashMap<Integer, Integer> aMap = new HashMap<>();
        aMap.put(0, 1);
        return dfs(root, sum, 0, aMap);
    }

//  it returns the total count of valid paths in the subtree rooted at the current node.
    public int dfs(TreeNode root, int sum, int curr, HashMap<Integer, Integer> aMap){
        if(root==null) return 0;
        curr = curr + root.val;
        int res = aMap.getOrDefault(curr-sum, 0);
        aMap.put(curr, aMap.getOrDefault(curr, 0)+1);
        res = res + dfs(root.left, sum, curr, aMap) + dfs(root.right, sum, curr, aMap);
        // Because dfs(root.left) will change the map, so we need to restore the map
        aMap.put(curr, aMap.get(curr)-1);
        return res;
    }
}
