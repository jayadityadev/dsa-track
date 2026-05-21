public class PalindromeCheck {
    private static boolean check_palindrome(int num) {
        int temp = num;
        int rev = 0;
        while (temp > 0) {
            int last_digit = temp % 10;
            rev = rev * 10 + last_digit;
            temp /= 10;
        }
        return num == rev;
    }

    public static void main(String[] args) {
        System.out.println(check_palindrome(010));
    }
}
