package Exercice;

import java.util.ArrayList;
import java.util.List;

public class numberDisappered {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list= new ArrayList<>();
        int len = nums.length;

        int[] newNum =new int[len];

        for(int i=0; i<len; i++){
            newNum[nums[i]-1]=nums[i];
        }

        for (int i=0;i<len;i++){
            if(newNum[i]==0){
                list.add(i+1);

            }
        }
        return list;
    }
}
