package Exercice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {

        int start = 0;
        int end = nums.length-1;


        while(true){
            int val = partition(nums,start,end);
            if(val == k-1 )
                return nums[k-1];
            else if(val<k-1){
                start = val+1;
            }else{
                end = val-1;
            }
        }

    }

    public int partition(int[] nums, int start,int end){

        int i=start;
        int j=end;
        int pivot = nums[start];
        while(i<=j){
            if(pivot>nums[i] && pivot < nums[j]){
                swapE(nums,i,j);
                i++;
                j--;
            }
            else if(nums[i]>=pivot){
                i++;
            }else if(nums[j]<=pivot) j--;

        }
        swapE(nums,start,j);
        return j;

    }

    public void swapE(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
