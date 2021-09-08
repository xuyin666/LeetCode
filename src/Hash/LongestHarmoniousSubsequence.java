package Hash;

// 594. Longest Harmonious Subsequence
// We define a harmonious array as an array
// where the difference between its maximum value and its minimum value is exactly 1.
// Given an integer array nums,
// return the length of its longest harmonious subsequence among all its possible subsequences.
// A subsequence of array is a sequence that can be derived from the array by deleting some or no elements
// without changing the order of the remaining elements.


import java.util.HashMap;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }
        int maxLHS = 0;
        for (int tmp : hashMap.keySet()) {
            if (hashMap.containsKey(tmp+1))
                maxLHS = Math.max(maxLHS, hashMap.get(tmp) + hashMap.get(tmp + 1));
        }
        return maxLHS;
    }
}
