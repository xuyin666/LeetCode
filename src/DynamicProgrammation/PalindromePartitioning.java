package DynamicProgrammation;

import java.util.ArrayList;
import java.util.List;

// 131. Palindrome Partitioning
// Given a string s, partition s such that every substring of the partition is a palindrome.
// Return all possible palindrome partitioning of s.
// A palindrome string is a string that reads the same backward as forward.

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> list = new ArrayList<>();
        if(s.length()==0) return res;
        dfs(s, 0, s.length()-1, res, list);
        return res;
    }

    public List<List<String>> dfs(String s, int start, int end, List<List<String>> res, List<String> list){
        if(start==end+1){
            res.add(new ArrayList<>(list));
        }else{
            for(int i=start; i <= end; i++){
                if(isPalindrome(s, start, i)){
                    list.add(s.substring(start, i+1));
                    dfs(s, i+1, end, res, list);
                    list.remove(list.size()-1);
                }
            }
        }
        return res;
    }

    public boolean isPalindrome(String s, int start, int end){
        for(int i=start, j=end; i<=j; i++, j--){
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }
}
