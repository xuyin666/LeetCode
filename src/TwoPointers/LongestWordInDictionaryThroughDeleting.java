package TwoPointers;

import java.util.List;

// Given a string s and a string array dictionary,
// return the longest string in the dictionary that can be formed by deleting some of the given string characters.
// If there is more than one possible result,
// return the longest word with the smallest lexicographical order.
// If there is no possible result, return the empty string.

public class LongestWordInDictionaryThroughDeleting {
    public String findLongestWord(String s, List<String> dictionary) {
        String res = "";
        for (String str: dictionary){

//res.length() > str.length() 意味着只接受更长的字符串

            if ((s.length() < str.length()) || (res.length() > str.length())
                    || (res.length() == str.length() && res.compareTo(str) < 0 ))
                continue;
            if (isSubSet(s, str)){
                res = str;
            }
        }
        return res;
    }

    public boolean isSubSet(String model, String target) {
        int i = 0, j = 0;
        // model the longer string
        int lenStr = model.length();
        int lenTarget = target.length();

        while (i < lenStr && j < lenTarget) {
            if (model.charAt(i) != target.charAt(j)) {
                i++;
            } else {
                i++;
                j++;
            }
        }
        if(j == lenTarget)
            return true;
        return false;
    }
}
