package utils;

public abstract class AbstractSort {

    protected abstract void sort(int[] arr);

    public final void run() {

        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.print("Original Array: ");
        ArrayUtils.displayArr(arr);

        sort(arr);

        System.out.print("Sorted Array: ");
        ArrayUtils.displayArr(arr);
    }
}