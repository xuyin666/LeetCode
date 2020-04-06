package Exercice;

public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {


        if(A==null || A.length <3 ) return false;

        int i=0;

        int end = A.length-1;

        while(i<end && A[i]<A[i+1])
            i++;

        if(i==0 || i==end) return false;

        while(i<end && A[i]>A[i+1]){
            i++;
        }

        return i==end;


    }
}
