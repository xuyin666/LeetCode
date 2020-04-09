package Exercice;

import java.util.TreeSet;

public class FindDistanceValue {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int count=0;

        TreeSet<Integer> ts = new TreeSet<>();

        for(int a2: arr2){
            ts.add(a2);
        }

        for(int a1 : arr1){
            int dif = 0;
            Integer higher = ts.ceiling(a1);
            Integer lower = ts.floor(a1);

            // Can't find a greater value than him
            if(higher==null){
                dif = a1-lower;
            }else if(lower == null){
                dif = a1-higher;
            }else{
                dif = Math.min(higher-a1,a1-lower);
            }

            if(dif > d){
                count++;
            }
        }

        return count;
    }
}
