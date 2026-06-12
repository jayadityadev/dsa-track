package basics.recursion;

// Problem Statement: You are given an array. The task is to reverse the array and print it.

import java.util.Arrays;

public class recursion6 {

    // Approach 1: Make a new array
    public static int[] reverseArrayNewArray(int size, int[] arr) {
        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i] = arr[size-i-1];
        }
        return ans;
    }

    // Approach 2: Modify the array
    public static void reverseArrayModifyArray(int size, int[] arr) {
        // (arrays are passed by reference, so modifying the same array, we dont need to return an array)
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1] = temp;
        }
    }

    // Approach 3: Collections utility
    public static int[] reverseArrayCollections(int size, int[] arr) {
        // too complicated for this use-case, primtive arrays cannot be passed into Collections utils
        return arr;
    }
    
    // Approach 4: Recursion
    public static void reverseArrayRecursion(int[] arr, int left, int right) {
        if (left >= right) return; // base case
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArrayRecursion(arr, left+1, right-1); // recursive call towards base case
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int size = arr.length;
        // reverseArrayRecursion(arr, 0, size-1);
        reverseArrayModifyArray(size, arr);
        System.out.println(Arrays.toString(arr));
    }
}
