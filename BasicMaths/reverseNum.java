public class reverseNum {

    private static int reverse_number(int num) {
        int temp = Math.abs(num);
        int rev = 0;
        while (temp > 0) {
            int last_digit = temp % 10;
            rev = rev * 10 + last_digit;
            temp /= 10;
        }
        return (num > 0) ? rev : -rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse_number(12));
    }
}
