package Exercice;

public class Permutation {
    public void printList(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println("");
    }

    public void swap(int[] a,int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public void getPermutation(int[] a, int start){
        if(start==a.length-1){
            printList(a);
        }else{
            for(int i=start; i<a.length;i++){
                swap(a,start,i);
                getPermutation(a, start+1);
                swap(a,start,i);
            }
        }
    }

    public boolean isSwap(int[] a, int start, int i){
        while(start < i){
            if(a[start]==a[i])
                return false;
            start++;
        }

        return true;
    }

    public void getPermutationSpec(int[] a,int start){
        if(start==a.length-1){
            printList(a);
        }else{
            for(int i=start; i<a.length;i++){
                if(isSwap(a,i,start)){
                    swap(a,start,i);
                    getPermutationSpec(a, start+1);
                    swap(a,start,i);
                }
            }
        }
    }
}
