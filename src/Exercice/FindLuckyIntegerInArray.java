package Exercice;

public class FindLuckyIntegerInArray{

    public int findLucky(int[] arr) {

        int index=0;
        boolean find=false;
        int i;
        for(i=0; i<arr.length; i++){
            if(arr[i]==i){
                index = i;
                find = true;
            }
        }
        if(i==arr.length && find ==false){
            return -1;
        }

        return index;
    }
}
