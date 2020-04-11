package Exercice;

import java.util.TreeMap;

public class FindLuckyIntegerInArray{

    public int findLucky(int[] arr) {

        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int nums: arr){
            tm.put(nums,tm.getOrDefault(nums,0)+1);
        }

        int max = -1;
        for(int nums: tm.keySet()){
            if(nums == tm.get(nums)){
                max = Math.max(max,nums);
            }
        }

        return max;
    }
}
