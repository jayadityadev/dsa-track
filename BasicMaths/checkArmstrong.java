public class checkArmstrong {
    
    public static boolean check_armstrong(int num) {
        if (num == 0) return true;
        int armstrng = 0;
        int temp = num;
        int digits = (int) Math.floor(Math.log10(temp)) + 1;
        while (temp > 0) {
            int last_digit = temp % 10;
            armstrng += (int) Math.round(Math.pow(last_digit, digits));
            temp /= 10;
        }
        return num == armstrng;
    }

    public static void main(String[] args) {
        System.out.println(check_armstrong(0));
    }
}
