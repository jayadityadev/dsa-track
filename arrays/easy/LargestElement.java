package arrays.easy;

import utils.ArrayUtils;

public class LargestElement {

	private static int findLargest(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) max = arr[i];
		}
		return max;
	}

	public static void main(String[] args) {

		int[] arr = {13,46,20,24,52,20,9};
		
		System.out.print("Array: ");
		ArrayUtils.displayArr(arr);

		int max = findLargest(arr);
		System.out.println("Max element: " + max);
	}
}
