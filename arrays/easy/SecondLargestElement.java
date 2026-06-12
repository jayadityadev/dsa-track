package arrays.easy;

import java.util.Arrays;
import utils.ArrayUtils;

public class SecondLargestElement {
    
    // Approach: By sorting

    private static int secondLargestBySorting(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    
    private static int secondSmallestBySorting(int[] arr) {
        // ArrayUtils.sort(arr); // Cuz secondLargestBySorting was called first, sorting the array in-place. No need to sort again.
        return arr[1];
    }

    private static int secondLargest(int[] arr) {
        return 1;
    }

    private static int secondSmallest(int[] arr) {
        return 1;
    }

	public static void main(String[] args) {

        int[] arr = {13,46,20,24,52,20,9};
		System.out.print("Array: ");
        ArrayUtils.displayArr(arr);

		int secondMax = secondLargestBySorting(arr);
		System.out.println("Second largest element: " + secondMax);

		int secondMin = secondSmallestBySorting(arr);
		System.out.println("Second smallest element: " + secondMin);
        
	}

}
