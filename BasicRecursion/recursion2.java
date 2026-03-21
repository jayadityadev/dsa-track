// Problem Description: Given an integer N, write a program to print numbers from 1 to N.

public class recursion2 {
    public static void printNumbers(int n) {
        // base case
        if (n == 0) return;
        // recursive case
        printNumbers(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printNumbers(5);
    }
}
