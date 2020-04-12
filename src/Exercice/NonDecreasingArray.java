package Exercice;

public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {

        int count=0;
        int i=0;
        while(i<nums.length-1){
            if(nums[i]<=nums[i+1]){
                i++;
            }else{
                if(count==0)
                {
                    count++;
                    i++;
                }
                else
                    return false;
            }

        }


        if(i==nums.length-1){
            //if(nums[i-1]<=nums[i])
                return true;
            //return false;
        }


        return false;
    }
}
