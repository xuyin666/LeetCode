package Tree;

// 653. Two Sum IV - Input is a BST

// Given the root of a Binary Search Tree and a target number k,
// return true if there exist two elements in the BST such that their sum is equal to the given target.

import java.util.ArrayList;
import java.util.HashSet;

public class TwoSumIVInputIsBST {
//    public boolean findTarget(TreeNode root, int k) {
//        HashSet<Integer> hashSet = new HashSet<>();
//        return helper(root, k, hashSet);
//    }
//
//    public boolean helper(TreeNode root, int k, HashSet<Integer>hashSet){
//        if(root==null) return false;
//        if(hashSet.contains(k- root.val)) return true;
//        hashSet.add(root.val);
//        return helper(root.left, k, hashSet) || helper(root.right, k, hashSet);
//    }


    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> aList = new ArrayList<>();
        dfs(root, aList);
        int i, j;
        for( i=0, j=aList.size()-1; i<j;){
            if(aList.get(i)+aList.get(j)==k) return true;
            else if(aList.get(i)+aList.get(j)>k)
                j--;
            else i++;
        }
        return false;
    }

    public void dfs(TreeNode aNode, ArrayList<Integer> aList){
        if (aNode==null) return;
        dfs(aNode.left, aList);
        aList.add(aNode.val);
        dfs(aNode.right, aList);

    }
}
