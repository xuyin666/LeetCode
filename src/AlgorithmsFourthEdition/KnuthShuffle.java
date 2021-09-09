package AlgorithmsFourthEdition;

public class KnuthShuffle {
    public void shuffle(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int rand = (int)(Math.random() * (i + 1));
            exchange(arr, i, rand);
        }
    }

    public void exchange (int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
