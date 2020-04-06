import Exercice.*;
import AlgoClassic.*;
import javax.swing.plaf.synth.SynthLabelUI;
import java.util.List;
import java.util.concurrent.locks.StampedLock;

public class test {
    public static void main (String[] args){
        int[] tmp;
        int[] arr1={3,1};


        SearchInRotatedArray sirii = new SearchInRotatedArray();
        int bol = sirii.search(arr1,9);
        System.out.print(bol);

        /*
        for(int i=0; i<tmp.length;i++){
            System.out.print(tmp[i]);
        }*/
    }
}
