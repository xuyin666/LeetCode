package Exercice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class ShuffleArray {

    int[] nums;

    public ShuffleArray(int[] nums) {
        this.nums=nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {

        if(nums.length==0) return null;
        int[] tmp = nums.clone();
        Random rand = new Random();
        for(int i=tmp.length-1;i>=0;i--){
            int j = rand.nextInt(i+1);
            swap(tmp,i,j);
        }
        return tmp;
    }


    public void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j]=tmp;
    }

}
