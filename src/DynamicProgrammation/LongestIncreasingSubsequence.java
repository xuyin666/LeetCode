package DynamicProgrammation;

// 300. Longest Increasing Subsequence

// Given an integer array nums, return the length of the longest strictly increasing subsequence.

// A subsequence is a sequence that can be derived from an array
// by deleting some or no elements without changing the order of the remaining elements.

// For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].


public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        // dp[i] 是指最长子序列而且包括nums[i] 这种情况下nums[i]为最大值
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for(int i = 1; i <= nums.length - 1; i++) {
            dp[i] = 1;
            for(int j = i-1; j >= 0; j--) {
                if (nums[i] > nums[j])
                    dp[i] = Math.max(1 + dp[j], dp[i]);
            }
        }

        // 不一定是这样子
        //return dp[nums.length - 1];
        int maxValue = 0;
        for(int i = 0; i < nums.length; i++) {
            maxValue = Math.max(maxValue, dp[i]);
        }

        return maxValue;
    }
}
