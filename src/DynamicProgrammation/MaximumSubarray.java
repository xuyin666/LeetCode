package DynamicProgrammation;

// 53. Maximum Subarray
// Given an integer array nums, find the contiguous subarray (containing at least one number)
// which has the largest sum and return its sum.

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        return helper(nums, 0);
    }

    public int helper(int[] nums, int index){
        if(nums.length==0) return 0;
        if (index>nums.length-1) return 0;
        return Math.max(nums[index]+helper(nums, index+1), helper(nums, index+1));
    }

}
