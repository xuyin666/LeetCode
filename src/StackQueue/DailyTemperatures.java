package StackQueue;

// 739. Daily Temperatures
// Given an array of integers temperatures represents the daily temperatures,
// return an array answer
// such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
// If there is no future day for which this is possible, keep answer[i] == 0 instead.


import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int lenArr = temperatures.length;
        int[] newArr = new int[lenArr];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < lenArr; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int tmpIndex = stack.pop();
                newArr[tmpIndex] = i - tmpIndex;
            }
            stack.push(i);
        }
        return newArr;
    }
}
