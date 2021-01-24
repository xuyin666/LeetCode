package Tree;

// 654. Maximum Binary Tree
// You are given an integer array nums with no duplicates.
// A maximum binary tree can be built recursively from nums using the following algorithm:

// Create a root node whose value is the maximum value in nums.
// Recursively build the left subtree on the subarray prefix to the left of the maximum value.
// Recursively build the right subtree on the subarray suffix to the right of the maximum value.

// Return the maximum binary tree built from nums.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumBinaryTree {
//    public TreeNode constructMaximumBinaryTree(int[] nums) {
//        List<Integer> arrayList = new ArrayList<>();
//        for(int i=0; i< nums.length; i++){
//            arrayList.add(nums[i]);
//        }
//        return helper(arrayList);
//    }
//
//    public TreeNode helper(List<Integer> arrayList){
//        if(arrayList.size()==0) return null;
//        int max = Collections.max(arrayList);
//        int index = arrayList.indexOf(max);
//        TreeNode aNode = new TreeNode(max);
//        List<Integer> leftSub = arrayList.subList(0, index);
//        List<Integer> rightSub = arrayList.subList(index+1, arrayList.size());
//        aNode.left = helper(leftSub);
//        aNode.right = helper(rightSub);
//        return aNode;
//    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums, 0, nums.length-1);
    }

    public TreeNode buildTree(int[] nums, int start, int end){
        if(start>end) return null;
        int max = findMax(nums, start, end);
        TreeNode aNode = new TreeNode(nums[max]);
        aNode.left = buildTree(nums, start, max-1);
        aNode.right = buildTree(nums, max+1, end);
        return aNode;
    }

    public int findMax(int[] nums, int start, int end){
        int max = start;
        for(int i = start+1; i<=end; i++){
            if(nums[i] > nums[max]){
                max = i;
            }
        }
        return max;
    }

}
