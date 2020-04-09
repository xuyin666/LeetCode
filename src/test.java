import Exercice.*;
import AlgoClassic.*;
import javax.swing.plaf.synth.SynthLabelUI;
import java.util.List;
import java.util.concurrent.locks.StampedLock;

public class test {
    public static void main (String[] args){
        int[] tmp;
        //int[] arr1={4,5,8};
        //int[] arr2={10,9,1,8};


        //int[] test ={7,2,7,2,4,74,23,25,75,23,45,1,100};
        //QuickSort qs =new QuickSort();
        //qs.quickSort(test,0, test.length-1);

        //MergeSort ms =new MergeSort();
        //ms.Sort(test);
        //System.out.print(val);

        FindLuckyIntegerInArray fliia =new FindLuckyIntegerInArray();
        int arr[] = {2,2,3,4};
        int val=fliia.findLucky(arr);
        System.out.print(val);



        //for(int i=0; i<test.length;i++){
          //  System.out.print(test[i]+" ");
        //}
    }
}
