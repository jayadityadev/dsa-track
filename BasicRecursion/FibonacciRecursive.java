// Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.

public class FibonacciRecursive {
    
    public static int printFibonacci(int n) {
        // F(n) = F(n-1) + F(n-2)
        if (n == 0) return 0;
        if (n == 1) return 1;
        return printFibonacci(n-1) + printFibonacci(n-2);
    }

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++)
            System.out.print(printFibonacci(i) + " ");
        System.out.println();
    }
}
