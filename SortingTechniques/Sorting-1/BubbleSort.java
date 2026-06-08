public class BubbleSort extends SortUtils {

    @Override
    protected void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
    public static void main(String[] args) {
        new BubbleSort().run();
    }
}