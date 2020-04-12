package Exercice;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {

        Map<Integer,Integer> mp= new HashMap<>();
        for (int i=0; i<nums.length;i++){
            if(nums[i]==0) nums[i]=-1;
        }

        int sum=0;
        int max=0;
        for(int i=0; i<nums.length;i++){
            sum = sum + nums[i];
            if(sum==0){
                max = Math.max(max,i+1);
            }else{
                if(mp.containsKey(sum)){
                    max = Math.max(max,i-mp.get(sum));
                }else{
                    mp.put(sum,i);
                }
            }
        }

        return max;
    }


}
