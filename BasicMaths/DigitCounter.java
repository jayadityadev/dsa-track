public class DigitCounter {
    public static int count_digits_via_loop(int num) {
        if (num == 0) return 1;
        num = Math.abs(num);
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int count_digits_via_log(int num) {
        return (int) Math.floor(Math.log10(num)) + 1;
    }

    public static int count_digits_via_type_conversion(int num) {
        return String.valueOf(num).length();
        // return Integer.toString(num).length();
    }

    public static void main(String[] args) {
        System.out.println(count_digits_via_loop(12345));
        System.out.println(count_digits_via_log(12345));
        System.out.println(count_digits_via_type_conversion(12345));
    }
}
