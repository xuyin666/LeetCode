package StringExercice;

// 696. Count Binary Substrings
// Give a binary string s, return the number of non-empty substrings
// that have the same number of 0's and 1's,
// and all the 0's and all the 1's in these substrings are grouped consecutively.
//
// Substrings that occur multiple times are counted the number of times they occur.

public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int pre = 0;
        int curr = 1;
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                pre = curr;
                curr = 1;
            }
            if (pre >= curr) count++;
        }
        return count;
    }
}
