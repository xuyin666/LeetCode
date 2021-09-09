import AlgorithmsFourthEdition.InsertionSort;
import AlgorithmsFourthEdition.KnuthShuffle;
import AlgorithmsFourthEdition.SelectionSort;
import AlgorithmsFourthEdition.ShellSort;
import DynamicProgrammation.IntegerBreak;


public class Test {
    public static void main(String[] args){
        int[] arr = {1, 9, 7, 5, 6, 3, 2, 8, 4};
//        SelectionSort ss = new SelectionSort();
//        ss.sort(arr);
//        InsertionSort is = new InsertionSort();
//        is.sort(arr);
        ShellSort shs = new ShellSort();
        shs.sort(arr) ;
        KnuthShuffle ks = new KnuthShuffle();
        ks.shuffle(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.println("******* " + arr[i]);
        //System.out.println("Hello world");

    }
}
