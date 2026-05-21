// Problem Description: Given an integer N, write a program to print your name N times.

public class PrintNameNTimes {

    public static void printName(int n) {
        // base case
        if (n == 0) return;
        // recursive case
        System.out.print("Jayaditya ");
        printName(n-1);
    }
    public static void main(String[] args) {
        printName(10);
        System.out.println();
    }


}
