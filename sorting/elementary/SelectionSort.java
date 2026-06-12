package sorting.elementary;

import utils.AbstractSort;
import utils.ArrayUtils;

public class SelectionSort extends AbstractSort {
    @Override
    protected void sort(int[] arr) {
        int i, j;
        for (i = 0; i < arr.length-1; i++) {
            int min = i;
            for (j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
            ArrayUtils.swap(arr, i, min);
        }
    }

    public static void main(String[] args) {
        new SelectionSort().run();
    }
}