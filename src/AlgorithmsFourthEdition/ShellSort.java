package AlgorithmsFourthEdition;

public class ShellSort {
    public void sort(int[] arr) {
        int len = arr.length;
        int h = 1;
        while (h < len/3) h = h * 3 + 1;
        while (h >= 1) {
            for (int i = h; i < len; i++) {
                for (int j = i; j >= h; j = j - h) {
                    if (arr[j] < arr[j - h]) exchange(arr, j, j - h);
                    else break;
                }
            }
            h = h / 3;
        }
    }

    public void exchange (int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
