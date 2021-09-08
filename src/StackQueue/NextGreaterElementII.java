package StackQueue;

// 503. Next Greater Element II
// Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]),
// return the next greater number for every element in nums.

// The next greater number of a number x is the first greater number to its traversing-order next in the array,
// which means you could search circularly to find its next greater number.
// If it doesn't exist, return -1 for this number.


import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int lenNums = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[lenNums];
        Arrays.fill(res, -1);
        for (int i = 0; i < lenNums * 2; i++) {
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i % lenNums]) {
                int tmpIndex = stack.pop();
                res[tmpIndex] = nums[i % lenNums];
            }
            stack.push(i % lenNums);
        }
        return res;
    }
}
