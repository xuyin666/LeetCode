package DynamicProgrammation;

// 53. Maximum Subarray
// Given an integer array nums, find the contiguous subarray (containing at least one number)
// which has the largest sum and return its sum.

import java.util.Arrays;
import java.util.Collections;

// f[0] = nums[0]
// f[i] = max(f[i-1]+nums[i], nums[i])
// the element i should be taken
public class MaximumSubarray {
//    public int maxSubArray(int[] nums) {
//        if(nums.length==0) return 0;
//        int f[] = new int[nums.length];
//        f[0] = nums[0];
//        for(int i=1; i<nums.length; i++){
//            if(f[i-1]<0)
//                f[i] = nums[i];
//            else
//                f[i] = f[i-1] + nums[i];
//        }
//
//        Arrays.sort(f);
//        return f[f.length-1];
//    }

    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        int sum=nums[0];
        int answer=nums[0];
        for(int i=1; i<nums.length; i++){
            sum = Math.max(sum+nums[i], nums[i]);
            if(sum>answer)
                answer = sum;
        }
        return answer;
    }


}
