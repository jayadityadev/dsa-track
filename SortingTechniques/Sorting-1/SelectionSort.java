public class SelectionSort {
    static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void sort(int[] arr) {
        int i, j;
        for (i = 0; i < arr.length-1; i++) {
            int min = i;
            for (j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
            swap(arr, i, min);
        }
    }

    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        System.out.print("Original Array: ");
        displayArr(arr);
        System.out.print("Sorted Array: ");
        sort(arr);
        displayArr(arr);
    }
}