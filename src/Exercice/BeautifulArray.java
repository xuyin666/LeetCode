package Exercice;

import java.util.ArrayList;
import java.util.List;

public class BeautifulArray {
    public int[] beautifulArray(int N) {

        List<Integer> newList= new ArrayList<>();
        newList.add(1);

        while(newList.size()<N){
            List<Integer> tmp =new ArrayList<>();
            for(Integer j: newList){
                if(2*j<=N){
                    tmp.add(j*2);
                }
            }
            for(Integer j:newList){
                if(2*j-1<=N){
                    tmp.add(j*2-1);
                }
            }
            newList=tmp;
        }

        int[] list =new int[newList.size()];
        for(int i=0; i<newList.size();i++){
            list[i]=newList.get(i);
        }

        return list;
    }
}
