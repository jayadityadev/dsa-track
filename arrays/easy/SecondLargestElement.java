// Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.


package arrays.easy;

import java.util.Arrays;
import utils.ArrayUtils;


public class SecondLargestElement {

    // Brute Force - O(n log n)
    private static int secondLargestBrute(int[] arr) {
        if (arr.length < 2) return -1;
        Arrays.sort(arr);
        for (int i = arr.length-2; i >= 0; i--)
            if (arr[i] != arr[arr.length-1]) return arr[i];
        return -1;
    }

    private static int secondSmallestBrute(int[] arr) {
        if (arr.length < 2) return -1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++)
            if (arr[i] != arr[0]) return arr[i];
        return -1;
    }

    // Better - O(2n)
    private static int secondLargestBetter(int[] arr) {
        if (arr.length < 2) return -1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        int next_max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > next_max && arr[i] < max)
                next_max = arr[i];
        return next_max == Integer.MIN_VALUE
                ? -1
                : next_max;
    }
            
    private static int secondSmallestBetter(int[] arr) {
        if (arr.length < 2) return -1;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
        int next_min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < next_min && arr[i] > min)
                next_min = arr[i];
        return next_min == Integer.MAX_VALUE
                ? -1
                : next_min;
    }

	public static void main(String[] args) {

        int[] arr = {13,46,20,24,52,20,9,52};
		System.out.print("Array: ");
        ArrayUtils.displayArr(arr);

        System.out.println("Brute");
		System.out.println("Second largest element: " + secondLargestBrute(arr.clone()));
		System.out.println("Second smallest element: " + secondSmallestBrute(arr.clone()));
        
        System.out.println("Better");
		System.out.println("Second largest element: " + secondLargestBetter(arr));
        System.out.println("Second smallest element: " + secondSmallestBetter(arr));
	}

}
