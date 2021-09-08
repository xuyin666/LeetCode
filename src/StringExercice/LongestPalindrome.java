package StringExercice;

// 409. Longest Palindrome
// Given a string s which consists of lowercase or uppercase letters,
// return the length of the longest palindrome that can be built with those letters.
// Letters are case sensitive, for example, "Aa" is not considered a palindrome here.


public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            // convert the char to int directly
            arr[s.charAt(i)]++;
        }
        int totalLen = 0;
        boolean odd_exist = false;
        for (int i = 0; i < 128; i++) {
            totalLen += (arr[i] / 2) * 2;
            if (arr[i] % 2 != 0) odd_exist = true;
        }
        if (odd_exist) totalLen++;
        return totalLen;
    }
}
