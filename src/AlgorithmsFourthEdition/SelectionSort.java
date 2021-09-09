package AlgorithmsFourthEdition;

public class SelectionSort {
    public void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            exchange(arr, i, min);
        }
    }

    public void exchange (int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
