import Exercice.*;
import AlgoClassic.*;
import javax.swing.plaf.synth.SynthLabelUI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.StampedLock;

public class test {
    public static void main (String[] args){
        int[] tmp;
        //int[] arr1={4,5,8};
        //int[] arr2={10,9,1,8};


        int[] test ={2,1,2,3,5,6,7,3};
        QuickSort qs =new QuickSort();
        qs.quickSort(test,0, test.length-1);

        //MergeSort ms =new MergeSort();
        //ms.Sort(test);
        //System.out.print(val);


        int[] arr ={3,2,1,5,6,4};
        KthLargestElement kle = new KthLargestElement();
        int val = kle.findKthLargest(arr,2);

        System.out.println(val);
        for(int i: arr){
            System.out.print(i);
        }


        System.out.println("");
        for(int i=0; i<test.length;i++){
            System.out.print(test[i]+" ");
        }
    }
}
