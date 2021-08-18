package Array;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> aList = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        int i, left, right;
        int len = nums.length;

        for (i = 0; i < len; i++) {
            right = len - 1;
            for (left = i + 1; left < right; left++) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    tmp.add(i);
                    tmp.add(left);
                    tmp.add(right);
                    aList.add(tmp);
                } else if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return aList;
    }
}
