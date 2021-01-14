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


public class DecodeWays {
    public int numDecodings(String s) {

        return 0;
    }

    public int helper(String s, int index){
        char ch = s.charAt(index);
        return 0;
//        if( ch=="0" )
//            return 0;
//        if( ch=="1" )
//            return helper(s, index+1) + helper(s, index+2);
//        if( ch=="3" || ch=="4" )
//            return 1+helper(s, index+1);
    }
}
