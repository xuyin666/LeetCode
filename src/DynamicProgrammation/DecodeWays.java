package DynamicProgrammation;

// 91. Decode Ways

//A message containing letters from A-Z can be encoded into numbers using the following mapping:
// 'A' -> "1"
// 'B' -> "2"
//        ...
// 'Z' -> "26"
// To decode an encoded message, all the digits must be mapped back into letters
// using the reverse of the mapping above (there may be multiple ways).
// For example, "111" can have each of its "1"s be mapped into 'A's to make "AAA",
// or it could be mapped to "11" and "1" ('K' and 'A' respectively) to make "KA".
// Note that "06" cannot be mapped into 'F' since "6" is different from "06".
// Given a non-empty string num containing only digits, return the number of ways to decode it.
// The answer is guaranteed to fit in a 32-bit integer.


import java.util.HashMap;

public class DecodeWays {
//    int len;
//    HashMap<Integer, Integer> aMap;
//    public int numDecodings(String s) {
//        len = s.length();
//        if(len==0) return 0;
//        aMap = new HashMap<>();
//        return helper(s, 0);
//    }
//
//
//    public int helper(String s, int index){
//        if(index>=len) return 1;
//        if(s.charAt(index)=='0') return 0;
//        if(aMap.containsKey(index))
//            return aMap.get(index);
//        boolean validFirst = valid(s, index);
//        boolean validSecond= valid(s, index, index+1);
//        if(validFirst && validSecond){
//            int aVal = helper(s, index+1) + helper(s, index+2);
//            aMap.put(index, aVal);
//            return aVal;
//        }else if(validFirst){
//            int aVal = helper(s, index+1);
//            aMap.put(index, aVal);
//            return aVal;
//        }else if(validSecond){
//            int aVal = helper(s, index+2);
//            aMap.put(index, aVal);
//            return aVal;
//        }
//        return 0;
//    }
//
//    public boolean valid(String s, int index){
//        if(s.charAt(index)!='0') return true;
//        return false;
//    }
//
//    public boolean valid(String s, int index, int index1){
//        if(index1<len){
//            String str = s.charAt(index) +""+ s.charAt(index1);
//            int val = Integer.parseInt(str);
//            if(val>=10 && val<=26){
//                return true;
//            }else{
//                return false;
//            }
//        }
//        return false;
//    }

//    dp[i]: represents possible decode ways to the ith char(include i), whose index in string is i-1
    public int numDecodings(String s) {
        int len = s.length();
        if(len==0){
            return 0;
        }
        int[] dp = new int[len+1];
        dp[0]=1;
        dp[1]= s.charAt(0)=='0'? 0 : 1;
        for(int i=2;i<=len; i++){
            if(valid(s, i-1) &&valid(s, i-2,i-1)){
                dp[i] = dp[i-1] + dp[i-2];
            }else if(valid(s, i-1)){
                dp[i] = dp[i-1];
            }else if(valid(s, i-2,i-1)){
                dp[i] = dp[i-2];
            }
            else break;
        }
        return dp[len];
    }

    public boolean valid(String s, int index){
        if(s.charAt(index)!='0') return true;
        return false;
    }

    public boolean valid(String s, int index, int index1){
        if(index1<s.length()){
            String str = s.charAt(index) +""+ s.charAt(index1);
            int val = Integer.parseInt(str);
            if(val>=10 && val<=26){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }


}
