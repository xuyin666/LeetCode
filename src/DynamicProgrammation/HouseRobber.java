package DynamicProgrammation;

// 198. House Robber
// You are a professional robber planning to rob houses along a street.
// Each house has a certain amount of money stashed,
// the only constraint stopping you from robbing each of them
// is that adjacent houses have security system connected and it will automatically contact the police
// if two adjacent houses were broken into on the same night.
// Given a list of non-negative integers representing the amount of money of each house,
// determine the maximum amount of money you can rob tonight without alerting the police.

import java.util.HashMap;

public class HouseRobber {
    // recursive
//    public int rob(int[] nums) {
//        if(nums.length==0) return 0;
//        HashMap<Integer, Integer> aMap = new HashMap<>();
//        return helper(nums, 0, nums.length-1, aMap);
//    }
//
//    public int helper(int[] nums, int start, int end, HashMap<Integer, Integer> aMap){
//
//        if(start>end) return 0;
//        if(aMap.containsKey(start)){
//            return aMap.get(start);
//        }
//        else{
//            int maxVal = Math.max(nums[start]+helper(nums, start+2, end, aMap), helper(nums,start+1, end, aMap));
//            aMap.put(start, maxVal);
//            return maxVal;
//        }
//    }
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i=2; i<dp.length; i++){
            dp[i] = Math.max(nums[i-1] + dp[i-2], dp[i-1]);
        }
        return dp[nums.length];
    }

}
