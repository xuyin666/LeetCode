package Tree;

// Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
// For this problem, a height-balanced binary tree is defined as a binary tree
// in which the depth of the two subtrees of every node never differ by more than 1.

public class SortedArray2BST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    public TreeNode helper(int[] nums, int start, int end){
        if(start>end) return null;
        if(start == end) return new TreeNode(nums[start]);
        int mid = start + (end-start)/2 ;
        TreeNode leftNode = helper(nums, start, mid-1);
        TreeNode rightNode = helper(nums, mid+1,end);
        return new TreeNode(nums[mid],leftNode, rightNode);
    }
}
