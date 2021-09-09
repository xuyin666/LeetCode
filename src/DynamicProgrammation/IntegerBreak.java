package DynamicProgrammation;

// 343. Integer Break
// Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
// Return the maximum product you can get.

/////// why why




public class IntegerBreak {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            int l = 1;
            while (l <= i - 1) {
                int r = i - l;
                int max1 = Math.max(dp[l] * dp[r], l * r);
                int max2 = Math.max(dp[l] * r, dp[r] * l);
                dp[i] = Math.max(Math.max(max1, max2), dp[i]);
                l++;
            }
        }
        return dp[n];
    }
}
