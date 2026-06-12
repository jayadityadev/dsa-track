package sorting.advanced;

import utils.AbstractSort;
import utils.ArrayUtils;


public class QuickSort extends AbstractSort {
    @Override
    protected void sort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    private void quickSort(int[] arr, int low, int high) {
        // Base case
        if (low >= high) return;
        int partitionIndex = getPartitionIndex(arr, low, high);
        quickSort(arr, low, partitionIndex-1);
        quickSort(arr, partitionIndex+1, high);
    }

    private int getPartitionIndex(int[] arr, int low, int high) {
        int pivot = low, i = low, j = high;
        while (i < j) {
            while (arr[i] <= arr[pivot] && i <= high-1) i++;
            while (arr[j] > arr[pivot] && j >= low+1) j--;
            if (i < j) ArrayUtils.swap(arr, i, j);
        }
        ArrayUtils.swap(arr, pivot, j);
        return j;
    }
    public static void main(String[] args) {
        new QuickSort().run();
    }
}
