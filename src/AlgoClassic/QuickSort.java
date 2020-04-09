package AlgoClassic;

public class QuickSort {
    public void quickSort(int[] list, int start, int end){

        if(start>=end){
            return;
        }
        int tmp = list[start];
        int i = start;
        int j = end;

        while(i <= j){
            while(tmp >= list[i]){
                i++;
            }
            while(tmp < list[j]){
                j--;
            }
            if(i<=j) {
                swap(list,i,j);
                i++;
                j--;
            }

        }
        swap(list,start,j);
        quickSort(list,start,j-1);
        quickSort(list,i,end);



    }

    public void swap(int[] a, int i, int j){
        int mid=a[i];
        a[i]=a[j];
        a[j]=mid;
    }

    public void printList(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
