package Exercice;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int num: nums){
            int index = Math.abs(num)-1;
            if(nums[index]<0){
                list.add(index+1);
                continue;
            }
            nums[index] = -nums[index];
        }

        return list;
    }
}
