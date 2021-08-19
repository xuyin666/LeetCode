package TwoPointers;

// 680. Valid Palindrome II
// Given a string s, return true if the s can be palindrome after deleting at most one character from it.

public class ValidPalindromeII {

    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }
        return true;
    }

    public boolean isPalindrome(String s, int start, int end) {
        for (int i = start, j = end; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }

}
