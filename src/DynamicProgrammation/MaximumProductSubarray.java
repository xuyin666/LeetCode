package DynamicProgrammation;

// 152. Maximum Product Subarray

// Given an integer array nums,
// find the contiguous subarray within an array (containing at least one number) which has the largest product.

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];
        for(int i=1;i<nums.length; i++){
            int max_p = currMax*nums[i];
            int min_p = currMin*nums[i];
            currMax = Math.max(min_p, Math.max(max_p, nums[i]));
            currMin = Math.min(min_p, Math.min(max_p, nums[i]));
            max = Math.max(currMax, max);
        }
        return max;
    }

}
