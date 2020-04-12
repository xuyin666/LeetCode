package Exercice;

public class Mototonic {
    public boolean isMonotonic(int[] A) {
        boolean descreasing = true;
        boolean creasing = true;
        for(int i = 0; i < A.length-1; i++){
            if(A[i] < A[i+1])
                descreasing = false;
            else if (A[i] > A[i+1])
                creasing = false;
        }

        return descreasing || creasing ;

    }
}
