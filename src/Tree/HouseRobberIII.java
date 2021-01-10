package Tree;

// 337. House Robber III
// The thief has found himself a new place for his thievery again.
// There is only one entrance to this area, called the "root."
// Besides the root, each house has one and only one parent house.
// After a tour, the smart thief realized that "all houses in this place forms a binary tree".
// It will automatically contact the police if two directly-linked houses were broken into on the same night.
// Determine the maximum amount of money the thief can rob tonight without alerting the police.

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class HouseRobberIII {
    public int rob(TreeNode root) {
        if(root==null) return 0;
        HashMap<TreeNode, Integer> fMap = new HashMap<>();
        HashMap<TreeNode, Integer> gMap = new HashMap<>();
        return Math.max(f(root, fMap, gMap), g(root, fMap, gMap));
    }

    // hashMap contains the value if we robbed the root;
    public int f(TreeNode root, HashMap<TreeNode, Integer> fMap, HashMap<TreeNode, Integer> gMap){
        if(root == null) return 0;
        if(fMap.containsKey(root)) return fMap.get(root);
        int aVal = root.val + g(root.left, fMap, gMap) + g(root.right, fMap, gMap);
        fMap.put(root, aVal);
        return aVal;
    }

    public int g(TreeNode root, HashMap<TreeNode, Integer> fMap, HashMap<TreeNode, Integer> gMap){
        if(root == null) return 0;
        if(gMap.containsKey(root)) return gMap.get(root);
        int aVal = Math.max(f(root.right, fMap, gMap), g(root.right, fMap, gMap))
                + Math.max(f(root.left, fMap, gMap), g(root.left, fMap, gMap));
        gMap.put(root, aVal);
        return aVal;
    }
}
