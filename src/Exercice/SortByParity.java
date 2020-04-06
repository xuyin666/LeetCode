package Exercice;

public class SortByParity {
    public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int[] result =new int[len];

        int m=0;
        int n=len-1;
        for(int i=0; i<len; i++){
            if(A[i]%2==0){
                result[m]=A[i];
                m++;
            }else{
                result[n]=A[i];
                n--;
            }
        }

        return result;
    }

}
