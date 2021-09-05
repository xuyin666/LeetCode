package DynamicProgrammation;

// 650. 2 Keys Keyboard
// There is only one character 'A' on the screen of a notepad.
// You can perform two operations on this notepad for each step:
// Copy All: You can copy all the characters present on the screen (a partial copy is not allowed).
// Paste: You can paste the characters which are copied last time.
// Given an integer n, return the minimum number of operations
// to get the character 'A' exactly n times on the screen.

public class TwoKeysKeyboard {
    public int minSteps(int n) {
        int[] dp = new int[n+1];
        for (int i = 0; i <= n; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                int times = i/j;
                if (i%j != 0)
                    continue;
                dp[i] = Math.min(dp[i], dp[times] + 1 + j - 1);
            }
        }
        return dp[n];
    }
}
