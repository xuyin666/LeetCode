package Hash;

// 128. Longest Consecutive Sequence
// Given an unsorted array of integers nums,
// return the length of the longest consecutive elements sequence.
// You must write an algorithm that runs in O(n) time.

import java.util.HashMap;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) continue;
            boolean l_exist = hashMap.containsKey(nums[i] - 1);
            boolean r_exist = hashMap.containsKey(nums[i] + 1);
            if (l_exist && r_exist) {
                int l_value = hashMap.get(nums[i] - 1);
                int r_value = hashMap.get(nums[i] + 1);
                hashMap.put(nums[i] - l_value, l_value + r_value + 1);
                hashMap.put(nums[i] + r_value, l_value + r_value + 1);
                hashMap.put(nums[i], l_value + r_value + 1);
            } else if (l_exist) {
                int l_value = hashMap.get(nums[i] - 1);
                hashMap.put(nums[i], l_value + 1);
                hashMap.put(nums[i] - l_value, l_value + 1);
            } else if (r_exist) {
                int r_value = hashMap.get(nums[i] + 1);
                hashMap.put(nums[i], r_value + 1);
                hashMap.put(nums[i] + r_value, r_value + 1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }
        int maxLength = 0;
        for (int key : hashMap.keySet()) {
            if (hashMap.get(key) > maxLength) {
                maxLength = hashMap.get(key);
            }
        }
        return maxLength;
    }
}
