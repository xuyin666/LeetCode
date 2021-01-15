package DynamicProgrammation;

import java.util.List;

// 131. Palindrome Partitioning
// Given a string s, partition s such that every substring of the partition is a palindrome.
// Return all possible palindrome partitioning of s.
// A palindrome string is a string that reads the same backward as forward.

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        return null;
    }

    public List<List<String>> helper(String s, int index, int start, int end){
        return null;
    }

    public boolean isPalindrome(String s, int start, int end){
        for(int i=start, j=end; i<=j; i++, j--){
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }
}
