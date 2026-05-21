// Problem Statement: Given a number ‘N’, find out the sum of the first N natural numbers .

public class SumFirstNNumbers {
    public static int sumOfNumbers(int n) { // O(N)
        if (n == 1) return 1;
        return n + sumOfNumbers(n-1);
    }
    public static int sumOfNumbersViaFormula(int n) { // O(1)
        return (int) (n * (n+1)) / 2;
    }
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(5));
        // System.out.println(sumOfNumbersViaFormula(5));
    }
}
