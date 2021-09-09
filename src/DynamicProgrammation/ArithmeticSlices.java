package DynamicProgrammation;

// 413. Arithmetic Slices

// An integer array is called arithmetic if it consists of at least three elements
// and if the difference between any two consecutive elements is the same.
// For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic sequences.
// Given an integer array nums, return the number of arithmetic subarrays of nums.
// A subarray is a contiguous subsequence of the array.


public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length;
        if (len <= 2) return 0;
        int[] dp = new int[len];
        for (int i = 2; i < len; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 0;
            }
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += dp[i];
        }
        return sum;
    }
}
