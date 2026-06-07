public class SelectionSort {
    static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void sort(int[] arr) {
        
    }

    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        System.out.print("Original Array: ");
        displayArr(arr);
        System.out.println("Sorted Array: ");
        displayArr(arr);
    }
}