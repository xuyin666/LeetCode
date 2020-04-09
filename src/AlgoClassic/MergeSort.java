package AlgoClassic;

public class MergeSort {
    public void Sort(int[] arr){
        int[] tmp = new int[arr.length];
        Sort(arr,0,arr.length-1,tmp);

    }

    public void Sort(int[] arr, int start, int end, int[] tmp){
        if(start<end){
            int mid=(start+end)/2;
            Sort(arr,start,mid,tmp);
            Sort(arr,mid+1,end,tmp);
            merge(arr,start,mid,end,tmp);
        }
    }

    public void merge(int[] arr, int start, int mid, int end, int[] tmp){
        int i=start;
        int j=mid+1;
        int count=0;
        while(i<=mid && j<=end){
            if(arr[i]>=arr[j]){
                tmp[count]=arr[j];
                j++;
                count++;
            }else{
                tmp[count]=arr[i];
                i++;
                count++;
            }
        }

        while(i<=mid){
            tmp[count]=arr[i];
            count++;
            i++;
        }

        while(j<=end){
            tmp[count]=arr[j];
            count++;
            j++;
        }

        count=0;
        while(start<=end){
            arr[start]=tmp[count];
            start++;
            count++;
        }
    }
}
