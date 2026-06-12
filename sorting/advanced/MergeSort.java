package sorting.advanced;

import utils.AbstractSort;

// Divide and Merge (Conquer)

public class MergeSort extends AbstractSort {
    @Override
    protected void sort(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
    }

    private void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high) {
        int left = low, right = mid + 1, idx = 0;
        int[] temp = new int[arr.length];
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right])
                temp[idx++] = arr[left++];
            else
                temp[idx++] = arr[right++];
        }
        while (left <= mid) temp[idx++] = arr[left++];
        while (right <= high) temp[idx++] = arr[right++];

        for (int i = low; i <= high; i++) arr[i] = temp[i - low];
    }

    public static void main(String[] args) {
        new MergeSort().run();
    }
}