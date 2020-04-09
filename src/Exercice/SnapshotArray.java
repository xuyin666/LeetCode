package Exercice;

import java.util.ArrayList;
import java.util.TreeMap;

public class SnapshotArray {

    TreeMap<Integer,Integer>[] the_map;
    int counter;

    public SnapshotArray(int length) {
        the_map = new TreeMap[length];
        for(int i=0; i<length; i++){
            the_map[i] = new TreeMap<Integer,Integer>();
            the_map[i].put(0,0);
        }
        counter = 0;
    }

    public void set(int index, int val) {
        the_map[index].put(counter,val);
    }

    public int snap() {
        counter++;
        return counter-1;

    }

    public int get(int index, int snap_id) {
        // Because maybe someone snap a lot times, some we might not have a snap_id corresponding a value

        return the_map[index].floorEntry(snap_id).getValue();

    }
}
