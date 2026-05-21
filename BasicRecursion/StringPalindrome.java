// Problem Statement: Given a string, check if the string is palindrome or not. A string is said to be palindrome if the reverse of the string is the same as the string.

public class StringPalindrome {
    
    // Approach 1: Iteration
    public static boolean checkPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++)
            if (str.charAt(i) != str.charAt(len-i-1))
                return false;
        return true;
    }

    // Approach 2: Recursion
    public static boolean checkPalindromeRecursion(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right))
            return false;
        return checkPalindromeRecursion(str, left+1, right-1);
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(checkPalindromeRecursion(str, 0, str.length()-1));
    }

}
