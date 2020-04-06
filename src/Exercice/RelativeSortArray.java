package Exercice;

import java.util.*;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] result = new int[len1];

        List<Integer> list = new ArrayList<>();

        HashMap<Integer,Integer> hashMap =new HashMap<>();

        for(int i=0; i<len2; i++) {
            hashMap.put(arr2[i],0);
        }

        for (int i=0; i<len1; i++){
            if (hashMap.containsKey(arr1[i])){
                int j = hashMap.get(arr1[i]);
                j++;
                hashMap.put(arr1[i],j);
            }
            else{
                list.add(arr1[i]);
            }
        }

        Collections.sort(list);

        int i=0;
        for(int k=0; k<len2; k++){
            int tmp=hashMap.get(arr2[k]);
            while(tmp>0){
                result[i]=arr2[k];
                i++;
                tmp--;
            }
        }

        for(Integer val: list){
            result[i]=val;
            i++;
        }

        return result;
    }
}
