package Exercice;

public class SquareSort {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        for(int i=0; i<len; i++){
            B[i]=A[i]*A[i];
        }
        for (int i=0; i<len-1; i++){
            for(int j=1; j<len; j++){
                if(B[j]<B[j-1]){
                    int temp = B[j];
                    B[j]=B[j-1];
                    B[j-1]=temp;
                }
            }
        }

        return B;


    }
}
