package sorting.elementary;

import utils.AbstractSort;

public class InsertionSort extends AbstractSort {
    @Override
    protected void sort(int[] arr) {
        // for (int i = 1; i < arr.length; i++)
        //     for (int j = i; j > 0; j--)
        //         if (arr[j] < arr[j-1])
        //             swap(arr, j, j-1);
        //         else break;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    

    public static void main(String[] args) {
        new InsertionSort().run();
    }
}