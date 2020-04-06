package AlgoClassic;

public class QuickSort {
    public void quickSort(int[] list, int start, int end){

        if(start>end){
            return;
        }
        int tmp = list[start];
        int i = start+1;
        int j = end;

        while(i <= j){
            while(i<=j && tmp > list[i]){
                i++;
            }
            while(i<=j && tmp < list[i]){
                swap(list,i,j);
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
}
