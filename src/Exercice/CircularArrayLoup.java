package Exercice;

public class CircularArrayLoup {
    public boolean circularArrayLoop(int[] nums) {

        if(nums.length<=1)
            return false;
        for(int i=0;i<nums.length;i++){

            if(nums[i]==0)
                continue;
            int j=i;
            int k=get_index(nums,i);

            while(nums[i]*nums[k]>0 & nums[k]*nums[get_index(nums,k)]>0){
                if(j==k){
                    if(j==get_index(nums,j))
                        break;
                    return true;
                }

                j = get_index(nums,j);
                k = get_index(nums,get_index(nums,k));
            }

            j=i;
            int val=get_index(nums,j);
            while(nums[j]*nums[val]>0){
                nums[j]=0;
                j=val;
                val = get_index(nums,val);
            }
        }

        return false;
    }

    int get_index(int[] nums, int start){
        int len = nums.length;
        if(start+nums[start]>=0){
            return (start+nums[start])%len;
        }else{
            return len+(start+nums[start])%len;
        }
    }
}
