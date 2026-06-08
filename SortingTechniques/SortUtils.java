public abstract class SortUtils {

    protected abstract void sort(int[] arr);

    protected static void displayArr(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    protected static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void run() {
        int[] arr = {13,46,24,52,20,9};

        System.out.print("Original Array: ");
        displayArr(arr);

        sort(arr);

        System.out.print("Sorted Array: ");
        displayArr(arr);
    }
}